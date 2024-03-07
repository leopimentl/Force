package com.leandrokhalel.force.modules.dtos;

import com.leandrokhalel.force.modules.entities.Exercicio;

import java.util.List;

public record RotinaDTO(
        String id,
        String titulo,
        List<Exercicio> exercicios,
        AutorDaRotinaDTO autor
) {
}
