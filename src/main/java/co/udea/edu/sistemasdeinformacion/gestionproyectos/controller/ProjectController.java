package co.udea.edu.sistemasdeinformacion.gestionproyectos.controller;

import co.udea.edu.sistemasdeinformacion.gestionproyectos.model.ProjectModel;
import co.udea.edu.sistemasdeinformacion.gestionproyectos.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class ProjectController {
    @Autowired
    private ProjectService projectService;

    @PostMapping("/save")
    public ResponseEntity<?> saveProject(@RequestBody() ProjectModel projectModel) {
        return projectService.saveProject(projectModel);
    }
}
