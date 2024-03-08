package com.leandrokhalel.force.modules.mappers;

import com.leandrokhalel.force.modules.dtos.CriaSerieDTO;
import com.leandrokhalel.force.modules.entities.Serie;
import org.springframework.stereotype.Component;

@Component
public class SerieMapper implements Mapper<CriaSerieDTO, Serie> {
    @Override
    public Serie map(CriaSerieDTO criaSerieDTO) {
        return Serie.builder()
                .id(null)
                .tipo(criaSerieDTO.tipo())
                .kilogramas(criaSerieDTO.kilogramas())
                .repeticoes(criaSerieDTO.repeticoes())
                .build();
    }
}
