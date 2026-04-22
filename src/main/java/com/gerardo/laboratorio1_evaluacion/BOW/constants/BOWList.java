package com.gerardo.laboratorio1_evaluacion.BOW.constants;

import com.gerardo.laboratorio1_evaluacion.BOW.domain.model.BOWModel;
import com.gerardo.laboratorio1_evaluacion.BOW.utils.Location;
import com.gerardo.laboratorio1_evaluacion.BOW.utils.Status;
import com.gerardo.laboratorio1_evaluacion.BOW.utils.VirusBase;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BOWList {
    private final List<BOWModel> list;

    public BOWList() {
        this.list = new ArrayList<>();

        this.list.add(BOWModel.builder()
                .name("Tyrant T-002")
                .base(VirusBase.T_VIRUS)
                .hazardLevel(5)
                .weakPoint("Heart")
                .currentStatus(Status.FREE)
                .lastLocation(Location.MANSION)
                .nextExpectedLocation(Location.LABORATORY)
                .build());

        this.list.add(BOWModel.builder()
                .name("Nemesis")
                .base(VirusBase.T_VIRUS)
                .hazardLevel(5)
                .weakPoint("Chest Core")
                .currentStatus(Status.FREE)
                .lastLocation(Location.POLICE_STATION)
                .nextExpectedLocation(Location.LABORATORY)
                .build());

        this.list.add(BOWModel.builder()
                .name("William Birkin")
                .base(VirusBase.G_VIRUS)
                .hazardLevel(5)
                .weakPoint("Eye")
                .currentStatus(Status.FREE)
                .lastLocation(Location.LABORATORY)
                .nextExpectedLocation(Location.POLICE_STATION)
                .build());

        this.list.add(BOWModel.builder()
                .name("G-Adult")
                .base(VirusBase.G_VIRUS)
                .hazardLevel(4)
                .weakPoint("Body Core")
                .currentStatus(Status.CONTAINED)
                .lastLocation(Location.LABORATORY)
                .nextExpectedLocation(Location.LABORATORY)
                .build());

        this.list.add(BOWModel.builder()
                .name("Regenerator")
                .base(VirusBase.LAS_PLAGAS)
                .hazardLevel(4)
                .weakPoint("Plagas inside body")
                .currentStatus(Status.FREE)
                .lastLocation(Location.VILLAGE)
                .nextExpectedLocation(Location.VILLAGE)
                .build());

        this.list.add(BOWModel.builder()
                .name("Iron Maiden")
                .base(VirusBase.LAS_PLAGAS)
                .hazardLevel(5)
                .weakPoint("Internal parasites")
                .currentStatus(Status.FREE)
                .lastLocation(Location.VILLAGE)
                .nextExpectedLocation(Location.MANSION)
                .build());

        this.list.add(BOWModel.builder()
                .name("Lady Dimitrescu")
                .base(VirusBase.CADOU)
                .hazardLevel(5)
                .weakPoint("Head/Heart")
                .currentStatus(Status.FREE)
                .lastLocation(Location.MANSION)
                .nextExpectedLocation(Location.VILLAGE)
                .build());

        this.list.add(BOWModel.builder()
                .name("Moreau")
                .base(VirusBase.CADOU)
                .hazardLevel(3)
                .weakPoint("Mouth core")
                .currentStatus(Status.CONTAINED)
                .lastLocation(Location.VILLAGE)
                .nextExpectedLocation(Location.LABORATORY)
                .build());

        this.list.add(BOWModel.builder()
                .name("Heisenberg")
                .base(VirusBase.CADOU)
                .hazardLevel(5)
                .weakPoint("Mechanical core")
                .currentStatus(Status.FREE)
                .lastLocation(Location.VILLAGE)
                .nextExpectedLocation(Location.MANSION)
                .build());

        this.list.add(BOWModel.builder()
                .name("Hunter β")
                .base(VirusBase.T_VIRUS)
                .hazardLevel(4)
                .weakPoint("Neck")
                .currentStatus(Status.EXPUNGED)
                .lastLocation(Location.LABORATORY)
                .nextExpectedLocation(Location.POLICE_STATION)
                .build());


    }

    public List<BOWModel> getBOWs() {
        return list;
    }
}
