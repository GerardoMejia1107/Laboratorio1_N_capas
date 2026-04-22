package com.gerardo.laboratorio1_evaluacion.BOW.domain.model;

import com.gerardo.laboratorio1_evaluacion.BOW.utils.Location;
import com.gerardo.laboratorio1_evaluacion.BOW.utils.Status;
import com.gerardo.laboratorio1_evaluacion.BOW.utils.VirusBase;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BOWModel {
    private Long id;
    private String name;
    private VirusBase base;
    private int hazardLevel;
    private String weakPoint;
    private Status currentStatus;
    private Location lastLocation;
    private Location nextExpectedLocation;
}
