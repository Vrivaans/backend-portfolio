package com.portafolio.backend.Repository;

import com.portafolio.backend.Models.HabilidadesModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HabilidadesRepository extends JpaRepository<HabilidadesModel, Long> {

}
