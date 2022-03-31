package co.udea.edu.sistemasdeinformacion.gestionproyectos.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "kpi")
public class KPIEntity {

    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String name;

    @Column
    private String description;

    @Column(nullable = false)
    private boolean completed;

}
