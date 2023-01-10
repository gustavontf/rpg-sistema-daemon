package com.daemon.sistema.rpg.api.services;

import com.daemon.sistema.rpg.api.models.FichaModel;
import com.daemon.sistema.rpg.api.repositories.FichaRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class FichaService {

    final FichaRepository fichaRepository;

    public FichaService(FichaRepository fichaRepository) {
        this.fichaRepository = fichaRepository;
    }

    @Transactional
    public FichaModel salvar(FichaModel fichaModel) {
        return fichaRepository.save(fichaModel);
    }

    public boolean existePorNomeENivel(String nome, Integer nivel) {
        return fichaRepository.existsByNomeAndNivel(nome, nivel);
    }

    public List<FichaModel> buscarTudo() {
        return fichaRepository.findAll();
    }
}
