package com.leandrokhalel.force.modules.services;

import com.leandrokhalel.force.modules.dtos.CriaRotinaDTO;
import com.leandrokhalel.force.modules.dtos.DetalhaRotinaDTO;
import com.leandrokhalel.force.modules.entities.Rotina;
import com.leandrokhalel.force.modules.mappers.RotinaMapper;
import com.leandrokhalel.force.modules.mappers.DetalhaRotinaMapper;
import com.leandrokhalel.force.modules.repositories.ExercicioRepository;
import com.leandrokhalel.force.modules.repositories.RotinaRepository;
import com.leandrokhalel.force.modules.repositories.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RotinaService {

    @Autowired
    private RotinaRepository rotinaRepository;

    @Autowired
    private ExercicioRepository exercicioRepository;

    @Autowired
    private SerieRepository serieRepository;

    @Autowired
    private RotinaMapper rotinaMapper;

    @Autowired
    private DetalhaRotinaMapper detalhaRotinaMapper;

    public DetalhaRotinaDTO save(CriaRotinaDTO rotinaDTO) {
        Rotina rotina = rotinaMapper.map(rotinaDTO);
        rotina.getExercicios().forEach(exercicio -> {
            exercicioRepository.save(exercicio);
            exercicio.getSeries().stream().forEach(serie -> serieRepository.save(serie));
        });

        rotinaRepository.save(rotina);

        return detalhaRotinaMapper.map(rotina);
    }

    public List<DetalhaRotinaDTO> findAll() {
        return rotinaRepository.findAll().stream().map(
                r ->  detalhaRotinaMapper.map(r)).toList();
    }
}
