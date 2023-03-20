package net.openwebinars.taller.app.modelos;

import org.springframework.stereotype.Component;

//en esta clase vamos a mapear los modelos de la base de datos: auto, personas.
//en otra palabras estamos serializando los datos de la base de datos para que puedan ser utilizados en la aplicación
@Component
public class MatriculaMapper {

    public Auto toAuto(Matricula matricula) {
        return Auto.builder()
                .placa(matricula.getPlaca())
                .marca(matricula.getMarca())
                .modelo(matricula.getModelo())
                .propietario(matricula.getId())
                .build();
    }

    public Persona toPersona(Matricula matricula) {
        return Persona.builder()
                .id(matricula.getId())
                .nombre(matricula.getNombrePropietario())
                .build();
    }
}
