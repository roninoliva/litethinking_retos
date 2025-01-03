package com.litethinkinking.reto1.lms_reto_1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
@AllArgsConstructor
public class Estudiante extends Persona{

    private Integer numeroEstudiante;
    private Float promedioNotas;

    public void listadoAsignaturas(){
        throw new UnsupportedOperationException("Metodo listadoAsignaturas() no implementado");
    }

    public void seminariosTomados(){
        throw new UnsupportedOperationException("Metodo seminariosTomados() no implementado");
    }
}
