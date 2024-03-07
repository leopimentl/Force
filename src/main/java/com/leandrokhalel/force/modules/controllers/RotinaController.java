package com.leandrokhalel.force.modules.controllers;

import com.leandrokhalel.force.modules.entities.Rotina;
import com.leandrokhalel.force.modules.repositories.RotinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("rotinas")
public class RotinaController {

    @Autowired
    private RotinaRepository rotinaRepository;

    @GetMapping
    public List<Rotina> findAll() {
        return rotinaRepository.findAll();
    }

    @PostMapping
    public Rotina save(@RequestBody Rotina rotina) {
        return rotinaRepository.save(rotina);
    }
}
