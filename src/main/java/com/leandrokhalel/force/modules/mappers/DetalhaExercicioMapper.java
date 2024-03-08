package com.leandrokhalel.force.modules.mappers;

import com.leandrokhalel.force.modules.dtos.DetalhaExercicioDTO;
import com.leandrokhalel.force.modules.dtos.DetalhaSerieDTO;
import com.leandrokhalel.force.modules.entities.Exercicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DetalhaExercicioMapper implements Mapper<Exercicio, DetalhaExercicioDTO> {

    @Autowired
    private DetalhaSerieMapper detalhaSerieMapper;

    @Override
    public DetalhaExercicioDTO map(Exercicio exercicio) {

        List<DetalhaSerieDTO> series = exercicio.getSeries().stream().map(
                s -> detalhaSerieMapper.map(s))
                .toList();

        return new DetalhaExercicioDTO(
                exercicio.getId(),
                exercicio.getNome(),
                exercicio.getDescanso(),
                series
        );
    }
}
