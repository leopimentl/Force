package com.leandrokhalel.force.modules.mappers;

import com.leandrokhalel.force.modules.dtos.AutorDaRotinaDTO;
import com.leandrokhalel.force.modules.dtos.CriaRotinaDTO;
import com.leandrokhalel.force.modules.dtos.DetalhaExercicioDTO;
import com.leandrokhalel.force.modules.dtos.DetalhaRotinaDTO;
import com.leandrokhalel.force.modules.entities.Rotina;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DetalhaRotinaMapper implements Mapper<Rotina, DetalhaRotinaDTO> {

    @Autowired
    private DetalhaExercicioMapper detalhaExercicioMapper;

    @Override
    public DetalhaRotinaDTO map(Rotina rotina) {

        AutorDaRotinaDTO autor = new AutorDaRotinaDTO(rotina.getUsuario().getId());

        List<DetalhaExercicioDTO> exercicios = rotina.getExercicios().stream().map(
                e -> detalhaExercicioMapper.map(e))
                .toList();

        return new DetalhaRotinaDTO(
            rotina.getId(),
                rotina.getTitulo(),
                exercicios
        );
    }
}
