package com.portafolio.backend.Repository;

import com.portafolio.backend.Models.ExperienciaModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaRepository extends JpaRepository<ExperienciaModel, Long> {
    
}
