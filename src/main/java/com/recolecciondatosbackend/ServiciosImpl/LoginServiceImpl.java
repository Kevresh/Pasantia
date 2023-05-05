package com.recolecciondatosbackend.ServiciosImpl;

import com.recolecciondatosbackend.Servicios.loginService;
import com.recolecciondatosbackend.modelos.User;
import com.recolecciondatosbackend.repositorios.loginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoginServiceImpl implements loginService {
    @Autowired
    private loginRepository LoginRepository;

    @Override
    public boolean login(String usuario, String contrasena) {
        Optional<User> user = LoginRepository.findByUsuarioAndContrasena(usuario, contrasena);
        return user.isPresent();
    }
}
