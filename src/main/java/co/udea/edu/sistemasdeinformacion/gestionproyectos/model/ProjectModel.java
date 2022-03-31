package co.udea.edu.sistemasdeinformacion.gestionproyectos.model;

import co.udea.edu.sistemasdeinformacion.gestionproyectos.entity.CommentEntity;
import co.udea.edu.sistemasdeinformacion.gestionproyectos.entity.KPIEntity;
import lombok.Data;

import java.util.List;

@Data
public class ProjectModel {

    private Integer id;
    private String name;
    private String document;
    private List<CommentEntity> comments;
    private List<KPIEntity> kpis;
    private List<UserModel> students;
    private List<UserModel> teachers;
}
