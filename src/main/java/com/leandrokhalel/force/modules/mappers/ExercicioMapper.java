package com.leandrokhalel.force.modules.mappers;

import com.leandrokhalel.force.modules.dtos.CriaExercicioDTO;
import com.leandrokhalel.force.modules.entities.Exercicio;
import com.leandrokhalel.force.modules.entities.Serie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ExercicioMapper implements Mapper<CriaExercicioDTO, Exercicio> {

    @Autowired
    private SerieMapper serieMapper;

    @Override
    public Exercicio map(CriaExercicioDTO criaExercicioDTO) {

        List<Serie> series = criaExercicioDTO.series().stream().map(
                dto -> serieMapper.map(dto))
                .toList();

        return Exercicio.builder()
                .nome(criaExercicioDTO.nome())
                .descanso(criaExercicioDTO.descanso())
                .series(series)
                .build();
    }
}
