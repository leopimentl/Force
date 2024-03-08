package com.leandrokhalel.force.modules.dtos;

import java.util.List;

public record DetalhaRotinaDTO(
        String id,

        String titulo,

        List<DetalhaExercicioDTO> exercicios


) {
}
