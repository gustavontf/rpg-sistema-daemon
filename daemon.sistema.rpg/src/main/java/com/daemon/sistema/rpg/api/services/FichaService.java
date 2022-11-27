package com.daemon.sistema.rpg.api.services;

import com.daemon.sistema.rpg.api.models.FichaModel;
import com.daemon.sistema.rpg.api.repositories.FichaRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

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

}
