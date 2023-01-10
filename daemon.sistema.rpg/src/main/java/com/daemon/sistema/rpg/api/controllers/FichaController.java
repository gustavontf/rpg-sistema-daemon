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
import java.util.Optional;
import java.util.UUID;

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

    @GetMapping("/{id}")
    public ResponseEntity<Object> bucarFicha(@PathVariable(value = "id") UUID id) {
        Optional<FichaModel> fichaModelOptional = fichaService.buscarPorId(id);

        if(!fichaModelOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Ficha não encontrada!");
        }

        return ResponseEntity.status(HttpStatus.OK).body(fichaModelOptional.get());
    }

    @DeleteMapping("/id")
    public ResponseEntity<Object> removerFicha(@PathVariable(value = "id") UUID id) {
        Optional<FichaModel> fichaModelOptional = fichaService.buscarPorId(id);

        if(!fichaModelOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Ficha não encontrada!");
        }

        fichaService.remover(fichaModelOptional.get());
        return ResponseEntity.status(HttpStatus.OK).body("Ficha removida com sucesso!");
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> atualizarFicha(@PathVariable(value = "id") UUID id, @RequestBody @Valid FichaDto fichaDto) {
        Optional<FichaModel> fichaModelOptional = fichaService.buscarPorId(id);

        if(!fichaModelOptional.isPresent()) {
            return  ResponseEntity.status(HttpStatus.NOT_FOUND).body("Ficha não encontrada!");
        }

//        var fichaModel = fichaModelOptional.get();
//
//        fichaModel.setNome(fichaDto.getNome());
//        fichaModel.setClasseSocialProfissao(fichaDto.getClasseSocialProfissao());
//        fichaModel.setNivel(fichaDto.getNivel());
//        fichaModel.setDataNascimento(fichaDto.getDataNascimento());
//        fichaModel.setLocalNascimento(fichaDto.getLocalNascimento());
//        fichaModel.setSexo(fichaDto.getSexo());
//        fichaModel.setAltura(fichaDto.getAltura());
//        fichaModel.setPeso(fichaDto.getPeso());
//        fichaModel.setIdadeAparente(fichaDto.getIdadeAparente());
//        fichaModel.setIdadeReal(fichaDto.getIdadeReal());
//        fichaModel.setReligiao(fichaDto.getReligiao());

        var fichaModel = new FichaModel();

        BeanUtils.copyProperties(fichaDto, fichaModel);
        fichaModel.setId(fichaModelOptional.get().getId());

        return ResponseEntity.status(HttpStatus.OK).body(fichaService.salvar(fichaModel));
    }


}
