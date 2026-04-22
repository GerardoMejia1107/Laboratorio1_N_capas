package com.gerardo.laboratorio1_evaluacion.BOW.repositories;

import com.gerardo.laboratorio1_evaluacion.BOW.constants.BOWList;
import com.gerardo.laboratorio1_evaluacion.BOW.domain.model.BOWModel;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
public class BOWRepository {
    private BOWList list;

    public List<BOWModel> getAll() {
        return list.getBOWs();
    }
}
