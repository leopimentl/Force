package com.leandrokhalel.force.modules.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document("usuarios")
public class Usuario {

    private String id;
    private String nome;
    //
}
