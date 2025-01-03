package com.litethinkinking.reto1.lms_reto_1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
@AllArgsConstructor
public class Profesor extends Persona{

    private Float salario;

    public void materiasDictadas(){
        throw new UnsupportedOperationException("Metodo materiasDictadas() no implementado");
    }

}
