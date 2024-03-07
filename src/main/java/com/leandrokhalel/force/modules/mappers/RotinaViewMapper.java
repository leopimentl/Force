package com.leandrokhalel.force.modules.mappers;

import com.leandrokhalel.force.modules.dtos.AutorDaRotinaDTO;
import com.leandrokhalel.force.modules.dtos.RotinaDTO;
import com.leandrokhalel.force.modules.entities.Rotina;
import org.springframework.stereotype.Component;

@Component
public class RotinaViewMapper implements Mapper<Rotina, RotinaDTO> {

    @Override
    public RotinaDTO map(Rotina rotina) {

        AutorDaRotinaDTO autor = new AutorDaRotinaDTO(rotina.getUsuario().getId());

        return new RotinaDTO(
                rotina.getId(),
                rotina.getTitulo(),
                rotina.getExercicios(),
                autor
        );
    }
}
