package com.gerardo.laboratorio1_evaluacion;

import com.gerardo.laboratorio1_evaluacion.BOW.domain.model.BOWModel;
import com.gerardo.laboratorio1_evaluacion.BOW.services.BOWService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class Laboratorio1EvaluacionApplication {

    public static void main(String[] args) {
        SpringApplication.run(Laboratorio1EvaluacionApplication.class, args);
    }

    @Bean
    public CommandLineRunner run(BOWService service) {
        return args -> {
            //filter by virus base
            System.out.println("==========UMBRELLA REPORT (Filtered by virus base = T-Virus)==========");
            service.findByVirusBase()
                    .forEach(BOWModel::printReport);

            //filter by current status
            System.out.println("==========UMBRELLA REPORT (Filtered by current status = FREE (En libertad))==========");
            service.findByCurrentStatus().forEach(BOWModel::printReport);
            //filter by active virus
            System.out.println("==========UMBRELLA REPORT (Filtered by virus base which have more than 1 case)==========");
            service.findVirusCaseCases().forEach(v -> System.out.println(v.name()));
        };
    }
}
