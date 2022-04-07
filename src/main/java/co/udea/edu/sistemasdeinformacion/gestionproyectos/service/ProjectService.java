package co.udea.edu.sistemasdeinformacion.gestionproyectos.service;

import co.udea.edu.sistemasdeinformacion.gestionproyectos.entity.ProjectEntity;
import co.udea.edu.sistemasdeinformacion.gestionproyectos.model.ProjectModel;
import co.udea.edu.sistemasdeinformacion.gestionproyectos.repository.ProjectRepositoryJPA;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjectService {
    @Autowired
    private ProjectRepositoryJPA projectRepositoryJPA;
    private final ModelMapper mapper = new ModelMapper();
    private Logger logger = LoggerFactory.getLogger(ProjectService.class);

    public ResponseEntity<Object> saveProject(ProjectModel projectModel) {
        ProjectEntity projectEntity = mapper.map(projectModel, ProjectEntity.class);
        try {
            projectRepositoryJPA.save(projectEntity);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return new ResponseEntity("Error en la base de datos", HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity("Registrado", HttpStatus.OK);
    }

    public ResponseEntity<?> updateProject(ProjectModel projectModel){
        Optional<ProjectEntity> projectEntity = projectRepositoryJPA.findById(projectModel.getId());
        if (!projectEntity.isEmpty()) {
            ProjectEntity projectEntityUpdated = mapper.map(projectModel, ProjectEntity.class);
            projectRepositoryJPA.save(projectEntityUpdated);

            return new ResponseEntity("Actualización Exitosa", HttpStatus.OK);
        }

        return new ResponseEntity("No se pudo actualizar", HttpStatus.OK);
    }

    public List<ProjectEntity> getProjects() {
        return projectRepositoryJPA.findAll();
    }
}
