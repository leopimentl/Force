package com.leandrokhalel.force.modules.repositories;

import com.leandrokhalel.force.modules.entities.Serie;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SerieRepository extends MongoRepository<Serie, String> {
}
