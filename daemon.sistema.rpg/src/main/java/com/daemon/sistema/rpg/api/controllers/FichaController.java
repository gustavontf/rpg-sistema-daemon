package com.daemon.sistema.rpg.api.controllers;

import com.daemon.sistema.rpg.api.dtos.FichaDto;
import com.daemon.sistema.rpg.api.models.FichaModel;
import com.daemon.sistema.rpg.api.services.FichaService;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/ficha")
public class FichaController {

    final FichaService fichaService;

    public FichaController(FichaService fichaService) {
        this.fichaService = fichaService;
    }

    @PostMapping
    public ResponseEntity<Object> salvarFicha(@RequestBody @Valid FichaDto fichaDto) {

        if(fichaService.existePorNomeENivel(fichaDto.getNome(), fichaDto.getNivel())) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Conflito: Ficha já cadastrada com este Nome e Nível!");
        }

        var fichaModel = new FichaModel();

        BeanUtils.copyProperties(fichaDto, fichaModel);

        return ResponseEntity.status(HttpStatus.CREATED).body(fichaService.salvar(fichaModel));
    }

    @GetMapping
    public ResponseEntity<List<FichaModel>> buscarTudasFichas() {
        return ResponseEntity.status(HttpStatus.OK).body(fichaService.buscarTudo());
    }

}
