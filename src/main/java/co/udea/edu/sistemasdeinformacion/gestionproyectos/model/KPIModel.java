package co.udea.edu.sistemasdeinformacion.gestionproyectos.model;

import lombok.Data;

@Data
public class KPIModel {
    private Integer id;
    private String name;
    private String description;
    private boolean completed;
}
