package com.leandrokhalel.force.modules.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document("rotina")
public class Rotina {

    @Id
    private String id;

    private String userId;
    private String titulo;
    private List<Exercicio> exercicios;

}
