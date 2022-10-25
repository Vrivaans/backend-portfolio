package com.portafolio.backend.Repository;

import com.portafolio.backend.Models.DescripcionModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DescripcionRepository extends JpaRepository<DescripcionModel, Integer> {

}
