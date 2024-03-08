package com.leandrokhalel.force.modules.entities;

import com.leandrokhalel.force.modules.entities.enums.TipoSerie;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document("series")
public class Serie {

    @Id
    private String id;

    private TipoSerie tipo;
    private Integer kilogramas;
    private Integer repeticoes;

}
