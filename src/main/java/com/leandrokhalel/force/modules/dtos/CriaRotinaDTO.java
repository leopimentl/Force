package com.leandrokhalel.force.modules.dtos;

import java.util.List;

public record CriaRotinaDTO(

        String titulo,

        AutorDaRotinaDTO autor,

        List<CriaExercicioDTO> exercicios

) {
}
