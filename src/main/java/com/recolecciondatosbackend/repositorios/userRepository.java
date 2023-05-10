package com.recolecciondatosbackend.repositorios;

import com.recolecciondatosbackend.modelos.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface userRepository extends JpaRepository<User, String> {
    Optional<User> findByUsuario(String usuario);
}
