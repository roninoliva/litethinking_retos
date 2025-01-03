package com.litethinkinking.reto1.lms_reto_1.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.litethinkinking.reto1.lms_reto_1.model.Estudiante;
import com.litethinkinking.reto1.lms_reto_1.service.IEstudianteService;

import lombok.RequiredArgsConstructor;



@RestController
@RequiredArgsConstructor
@RequestMapping("/api/estudiantes")
public class EstudianteController {

    private final IEstudianteService estudianteService;

    @GetMapping("/all")
    public List<Estudiante> getAll() {
        return estudianteService.getAll();  
    }

    @GetMapping("/order/promedio")
    public List<Estudiante> getMethodName() {
        return estudianteService.orderByPromedio();
    }
    

}
