package co.udea.edu.sistemasdeinformacion.gestionproyectos.entity;

import lombok.Data;
import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "project")
public class ProjectEntity {

    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String name;

    @Column
    private String document;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    private List<CommentEntity> comments;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    private List<KPIEntity> kpis;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    private List<UserEntity> students;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    private List<UserEntity> teachers;
}
