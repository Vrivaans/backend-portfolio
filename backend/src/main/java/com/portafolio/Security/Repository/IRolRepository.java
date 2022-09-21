package com.portafolio.Security.Repository;

import java.util.Optional;

import com.portafolio.Security.Entity.Rol;
import com.portafolio.Security.Enums.RolNombre;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRolRepository extends JpaRepository<Rol, Integer> {
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
