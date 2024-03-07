package com.leandrokhalel.force.modules.repositories;

import com.leandrokhalel.force.modules.entities.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsuarioRepository extends MongoRepository<Usuario, String> {
}
