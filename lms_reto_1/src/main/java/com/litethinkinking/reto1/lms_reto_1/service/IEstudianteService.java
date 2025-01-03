package com.litethinkinking.reto1.lms_reto_1.service;

import java.util.List;

import com.litethinkinking.reto1.lms_reto_1.model.Estudiante;

public interface IEstudianteService {

    List<Estudiante> getAll();
    List<Estudiante> orderByPromedio();

}
