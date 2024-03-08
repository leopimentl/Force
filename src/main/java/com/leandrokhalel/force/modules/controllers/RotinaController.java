package com.leandrokhalel.force.modules.controllers;

import com.leandrokhalel.force.modules.dtos.CriaRotinaDTO;
import com.leandrokhalel.force.modules.dtos.DetalhaRotinaDTO;
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
    public List<DetalhaRotinaDTO> findAll() {
        return rotinaService.findAll();
    }

    @PostMapping
    public DetalhaRotinaDTO save(@RequestBody CriaRotinaDTO criaRotinaDTO) {
        return rotinaService.save(criaRotinaDTO);
    }
}
