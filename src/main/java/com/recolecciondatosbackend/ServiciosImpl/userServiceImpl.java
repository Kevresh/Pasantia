package com.recolecciondatosbackend.ServiciosImpl;

import com.recolecciondatosbackend.Servicios.userService;
import com.recolecciondatosbackend.modelos.User;
import com.recolecciondatosbackend.repositorios.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class userServiceImpl implements userService {
    @Autowired
    private userRepository UserRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;
    @Override
    public boolean login(String usuario, String contrasena) {
        Optional<User> user = UserRepository.findByUsuario(usuario);
        if(user.isPresent()){
            // Verificar que la contraseña proporcionada coincida con la contraseña almacenada en la base de datos
            return passwordEncoder.matches(contrasena, user.get().getContrasena());
        }
        return false;
    }

    @Override
    public ResponseEntity<?> crear(User user) {
        try{
            // Encriptar contraseña
            String contrasenaEncriptada = passwordEncoder.encode(user.getContrasena());
            user.setContrasena(contrasenaEncriptada);
            UserRepository.save(user);
            return ResponseEntity.status(HttpStatus.CREATED).body("El usuarip " + user.getUsuario() + " ha sido creado correctamente.");
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Ocurrio un Error Guardando el Usuario");
        }
    }
}
