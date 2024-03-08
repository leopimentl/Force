package com.leandrokhalel.force.modules.dtos;

import com.leandrokhalel.force.modules.entities.enums.TipoSerie;
import lombok.Builder;

@Builder
public record DetalhaSerieDTO(
        String id,

        TipoSerie tipo,

        Integer kilogramas,

        Integer repeticoes
) {
}
