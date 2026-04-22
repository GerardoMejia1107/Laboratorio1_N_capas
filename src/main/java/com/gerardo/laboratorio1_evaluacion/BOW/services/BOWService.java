package com.gerardo.laboratorio1_evaluacion.BOW.services;

import com.gerardo.laboratorio1_evaluacion.BOW.domain.model.BOWModel;
import com.gerardo.laboratorio1_evaluacion.BOW.repositories.BOWRepository;
import com.gerardo.laboratorio1_evaluacion.BOW.utils.Status;
import com.gerardo.laboratorio1_evaluacion.BOW.utils.VirusBase;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BOWService {
    private BOWRepository repo;

    public List<BOWModel> findByVirusBase() {
        return repo.getAll()
                .stream()
                .filter(b -> b.getBase() == VirusBase.T_VIRUS)
                .toList();
    }

    public List<BOWModel> findByCurrentStatus() {
        return repo.getAll()
                .stream()
                .filter(b -> b.getCurrentStatus() == Status.CONTAINED)
                .toList();
    }

    public List<VirusBase> findVirusCaseCases() {
        return repo.getAll()
                .stream()
                .filter(b -> b.getCurrentStatus() == Status.FREE)
                .map(BOWModel::getBase)
                .distinct()
                .toList();
    }
}
