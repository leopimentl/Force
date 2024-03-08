package com.leandrokhalel.force.modules.mappers;

import com.leandrokhalel.force.modules.dtos.CriaRotinaDTO;
import com.leandrokhalel.force.modules.entities.Exercicio;
import com.leandrokhalel.force.modules.entities.Rotina;
import com.leandrokhalel.force.modules.entities.Usuario;
import com.leandrokhalel.force.modules.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RotinaMapper implements Mapper<CriaRotinaDTO, Rotina> {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private ExercicioMapper exercicioMapper;

    @Override
    public Rotina map(CriaRotinaDTO criaRotinaDTO) {

        String autorId = criaRotinaDTO.autor().id();

        Usuario usuario = usuarioRepository.findById(autorId).get();

        List<Exercicio> exercicios = criaRotinaDTO.exercicios().stream().map(
                        dto -> exercicioMapper.map(dto))
                .toList();

        return Rotina.builder()
                .id(null)
                .titulo(criaRotinaDTO.titulo())
                .usuario(usuario)
                .exercicios(exercicios)
                .build();
    }
}
