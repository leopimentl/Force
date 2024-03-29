package com.leandrokhalel.force.modules.entities;

import com.leandrokhalel.force.modules.entities.enums.NomeExercicio;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Duration;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document("exercicios")
public class Exercicio {

    @Id
    private String id;

    private Duration descanso;
    private NomeExercicio nome;
    private List<Serie> series;

}