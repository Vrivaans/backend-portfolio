package com.portafolio.backend.Repository;

import com.portafolio.backend.Models.EducacionModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducacionRepository extends JpaRepository<EducacionModel, Long> {

}
