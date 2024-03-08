package com.leandrokhalel.force.modules.dtos;

import com.leandrokhalel.force.modules.entities.enums.NomeExercicio;

import java.time.Duration;
import java.util.List;

public record CriaExercicioDTO(

        NomeExercicio nome,

        Duration descanso,

        List<CriaSerieDTO> series
) {
}
