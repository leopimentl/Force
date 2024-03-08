package com.leandrokhalel.force.modules.mappers;

import com.leandrokhalel.force.modules.dtos.DetalhaSerieDTO;
import com.leandrokhalel.force.modules.entities.Serie;
import org.springframework.stereotype.Component;

@Component
public class DetalhaSerieMapper implements Mapper<Serie, DetalhaSerieDTO> {

    @Override
    public DetalhaSerieDTO map(Serie serie) {
        return DetalhaSerieDTO.builder()
                .id(serie.getId())
                .tipo(serie.getTipo())
                .kilogramas(serie.getKilogramas())
                .repeticoes(serie.getRepeticoes())
                .build();
    }
}
