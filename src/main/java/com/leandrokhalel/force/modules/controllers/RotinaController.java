package com.leandrokhalel.force.modules.controllers;

import com.leandrokhalel.force.modules.dtos.RotinaDTO;
import com.leandrokhalel.force.modules.entities.Rotina;
import com.leandrokhalel.force.modules.repositories.RotinaRepository;
import com.leandrokhalel.force.modules.services.RotinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("rotinas")
public class RotinaController {

    @Autowired
    private RotinaService rotinaService;

    @GetMapping
    public List<RotinaDTO> findAll() {
        return rotinaService.findAll();
    }

    @PostMapping
    public RotinaDTO save(@RequestBody RotinaDTO rotinaDTO) {
        return rotinaService.save(rotinaDTO);
    }
}
