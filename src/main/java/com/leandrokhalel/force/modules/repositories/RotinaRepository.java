package com.leandrokhalel.force.modules.repositories;

import com.leandrokhalel.force.modules.entities.Rotina;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RotinaRepository extends MongoRepository<Rotina, String> {
}
