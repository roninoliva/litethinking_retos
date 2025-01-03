package com.litethinkinking.reto1.lms_reto_1.model;

import lombok.Data;

@Data
public class Persona {

    private String nombre;
    private String numeroCelular;
    private String correoElectronico;
    private Direccion direccion;

    public void comprarPaseEstacionamiento(){
        throw new UnsupportedOperationException("Metodo comprarPaseEstacionamiento() no implementado");    
    }

}
