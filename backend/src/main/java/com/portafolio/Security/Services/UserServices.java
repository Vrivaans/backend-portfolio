package com.portafolio.Security.Services;

import java.util.Optional;

import javax.transaction.Transactional;

import com.portafolio.Security.Entity.User;
import com.portafolio.Security.Repository.IUsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserServices {
    @Autowired
    IUsuarioRepository iusuarioRepository;

    public Optional<User> getByNombreUsuario(String nombreUsuario) {
        return iusuarioRepository.findByNombreUsuario(nombreUsuario); //
    }

    public boolean existsByUserName(String username) {
        return iusuarioRepository.existsByNombreUsuario(username);
    }

    public boolean existsByEmail(String email) {
        return iusuarioRepository.existsByEmail(email);
    }

    public void save(User user) {
        iusuarioRepository.save(user);
    }
}
