package com.recolecciondatosbackend.controladores;

import com.recolecciondatosbackend.DTO.usuarioDTO;
import com.recolecciondatosbackend.Servicios.loginService;
import com.recolecciondatosbackend.modelos.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
@CrossOrigin(origins = "http://localhost:4200/")
public class loginController {

    @Autowired
    private loginService loginService;

    @PostMapping("/user")
    public boolean login(@RequestBody usuarioDTO usuario) {
        return loginService.login(usuario.getUsuario(), usuario.getContrasena());
    }

}
