package com.portafolio.backend.Repository;

import com.portafolio.backend.Models.UsuarioModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long> {

}
