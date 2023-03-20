package net.openwebinars.taller.app.modelos;


import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Persona {

    @Id
    private String id;
    private String nombre;
}
