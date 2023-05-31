package com.recolecciondatosbackend.controladores;

import com.recolecciondatosbackend.DTO.preguntasDTO;
import com.recolecciondatosbackend.Servicios.PreguntasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/preguntas")
@CrossOrigin(origins = "http://localhost:3000/")
public class PreguntasController {

    @Autowired
    PreguntasService preguntasService;

}
