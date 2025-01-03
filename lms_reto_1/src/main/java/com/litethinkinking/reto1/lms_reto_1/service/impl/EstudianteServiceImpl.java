package com.litethinkinking.reto1.lms_reto_1.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.litethinkinking.reto1.lms_reto_1.model.Estudiante;
import com.litethinkinking.reto1.lms_reto_1.repository.RepositorioEstudiante;
import com.litethinkinking.reto1.lms_reto_1.service.IEstudianteService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EstudianteServiceImpl implements IEstudianteService {

    private final RepositorioEstudiante repositorioEstudiante;

    @Override
    public List<Estudiante> getAll() {
        return repositorioEstudiante.getAll();
    }

    @Override
    public List<Estudiante> orderByPromedio() {
        return repositorioEstudiante.getAll().stream().sorted((e1, e2) -> e1.getPromedioNotas().compareTo(e2.getPromedioNotas())).toList();
    }

}
