package com.leandrokhalel.force.modules.repositories;

import com.leandrokhalel.force.modules.entities.Exercicio;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ExercicioRepository extends MongoRepository<Exercicio, String> {
}
