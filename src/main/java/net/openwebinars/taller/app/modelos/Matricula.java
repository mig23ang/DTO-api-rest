package net.openwebinars.taller.app.modelos;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//en esta clase vamos a traer las propiedades de los modelos de la base de datos: auto, personas.

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Matricula implements Serializable {
    
    //atributos del modelo persona, para que sea especifico cambiamos el nombre de la variable nombre por nombrePropietario

    private String id;
    //private String nombre;
    private String nombrePropietario;


    //Atributos del modelo carro, aca eliminamos el atributo propietario, ya que no lo necesitamos
    private String placa;
    private String marca;
    private String modelo;
    //private String propietario;
}
