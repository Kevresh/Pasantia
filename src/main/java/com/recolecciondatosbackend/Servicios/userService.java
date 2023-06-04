package com.recolecciondatosbackend.Servicios;


import com.recolecciondatosbackend.modelos.User;
import org.springframework.http.ResponseEntity;

public interface userService {
    boolean login(String usuario, String contrasena);
    ResponseEntity<?> crear(User user);

}
