package com.portafolio.Security.Services;

import java.util.Optional;

import javax.transaction.Transactional;

import com.portafolio.Security.Entity.Rol;
import com.portafolio.Security.Enums.RolNombre;
import com.portafolio.Security.Repository.IRolRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolService {
    @Autowired
    IRolRepository irolRepository;

    public Optional<Rol> getByRolNombre(RolNombre rolNombre) {

        return irolRepository.findByRolNombre(rolNombre);
    }

    public void save(Rol rol) {
        irolRepository.save(rol);
    }

}
