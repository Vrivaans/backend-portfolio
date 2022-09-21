package com.portafolio.Security.Services;

import com.portafolio.Security.Entity.MainUser;
import com.portafolio.Security.Entity.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsImpl implements UserDetailsService {

    @Autowired
    UserServices userServices;

    @Override
    public UserDetails loadUserByUsername(String nombreUsuario) throws UsernameNotFoundException {

        User user = userServices.getByNombreUsuario(nombreUsuario).get();
        return MainUser.build(user);
    }

}
