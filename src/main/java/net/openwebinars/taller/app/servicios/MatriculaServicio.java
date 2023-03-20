package net.openwebinars.taller.app.servicios;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import net.openwebinars.taller.app.modelos.Auto;
import net.openwebinars.taller.app.modelos.Matricula;
import net.openwebinars.taller.app.modelos.MatriculaMapper;

import java.util.Optional;


@Service
public class MatriculaServicio {

    @Autowired
    private MatriculaMapper mapper;

    @Autowired
    private AutoServicio autoServicio;

    @Autowired
    private PersonaServicio personaServicio;

    public int guardar(Matricula in) {
        autoServicio.guardar(mapper.toAuto(in));
        personaServicio.guardar(mapper.toPersona(in));
        return 1;
    }

}
