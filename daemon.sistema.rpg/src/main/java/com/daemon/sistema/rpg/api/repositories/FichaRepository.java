package com.daemon.sistema.rpg.api.repositories;

import com.daemon.sistema.rpg.api.models.FichaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FichaRepository extends JpaRepository<FichaModel, Long> {



}
