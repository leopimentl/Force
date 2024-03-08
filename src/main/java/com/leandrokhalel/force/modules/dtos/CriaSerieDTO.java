package com.leandrokhalel.force.modules.dtos;

import com.leandrokhalel.force.modules.entities.enums.TipoSerie;

public record CriaSerieDTO(

         TipoSerie tipo,

         Integer kilogramas,

         Integer repeticoes
) {
}
