package com.leandrokhalel.force.modules.services;

import com.leandrokhalel.force.modules.dtos.RotinaDTO;
import com.leandrokhalel.force.modules.entities.Rotina;
import com.leandrokhalel.force.modules.mappers.RotinaMapper;
import com.leandrokhalel.force.modules.mappers.RotinaViewMapper;
import com.leandrokhalel.force.modules.repositories.RotinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RotinaService {

    @Autowired
    private RotinaRepository rotinaRepository;

    @Autowired
    private RotinaMapper rotinaMapper;

    @Autowired
    private RotinaViewMapper rotinaViewMapper;

    public RotinaDTO save(RotinaDTO rotinaDTO) {
        Rotina rotina = rotinaMapper.map(rotinaDTO);

        rotinaRepository.save(rotina);

        return rotinaViewMapper.map(rotina);
    }

    public List<RotinaDTO> findAll() {
        return rotinaRepository.findAll().stream().map(
                r ->  rotinaViewMapper.map(r)).toList();
    }
}
