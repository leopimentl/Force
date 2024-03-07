package com.leandrokhalel.force.modules.mappers;

import com.leandrokhalel.force.modules.dtos.RotinaDTO;
import com.leandrokhalel.force.modules.entities.Rotina;
import com.leandrokhalel.force.modules.entities.Usuario;
import com.leandrokhalel.force.modules.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RotinaMapper implements Mapper<RotinaDTO, Rotina> {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public Rotina map(RotinaDTO rotinaDTO) {

        String autorId = rotinaDTO.autor().id();

        Usuario usuario = usuarioRepository.findById(autorId).get();

        return new Rotina(
                rotinaDTO.id(),
                usuario,
                rotinaDTO.titulo(),
                rotinaDTO.exercicios()
        );
    }
}
