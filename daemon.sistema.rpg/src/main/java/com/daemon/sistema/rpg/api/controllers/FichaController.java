package com.daemon.sistema.rpg.api.controllers;

import com.daemon.sistema.rpg.api.models.FichaModel;
import com.daemon.sistema.rpg.api.services.FichaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ficha")
public class FichaController {

    final FichaService fichaService;

    public FichaController(FichaService fichaService) {
        this.fichaService = fichaService;
    }

    @PostMapping
    public ResponseEntity<Object> salvarFicha(@RequestBody FichaModel fichaModel) {
        return ResponseEntity.status(HttpStatus.CREATED).body(fichaService.salvar(fichaModel));
    }

    @GetMapping
    public String index() {
        return "Olá mundo!!!";
    }

}
