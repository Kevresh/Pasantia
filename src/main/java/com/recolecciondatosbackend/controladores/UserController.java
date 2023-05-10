package com.recolecciondatosbackend.controladores;

import com.recolecciondatosbackend.DTO.usuarioDTO;
import com.recolecciondatosbackend.Servicios.userService;
import com.recolecciondatosbackend.modelos.Plato;
import com.recolecciondatosbackend.modelos.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/User")
@CrossOrigin(origins = "http://localhost:3000/")
public class UserController {

    @Autowired
    private userService UserService;

    @PostMapping("/login")
    public boolean login(@RequestBody usuarioDTO usuario) {
        return UserService.login(usuario.getUsuario(), usuario.getContrasena());
    }

    @PostMapping("/CrearUser")
    public ResponseEntity<?> crearUser(@RequestBody usuarioDTO usuario) {
        User user = new User(usuario.getCedula(), usuario.getUsuario(), usuario.getContrasena(), usuario.getNombre());
        return UserService.crear(user);
    }



}
