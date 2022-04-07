package co.udea.edu.sistemasdeinformacion.gestionproyectos.controller;

import co.udea.edu.sistemasdeinformacion.gestionproyectos.entity.ProjectEntity;
import co.udea.edu.sistemasdeinformacion.gestionproyectos.entity.UserEntity;
import co.udea.edu.sistemasdeinformacion.gestionproyectos.service.ProjectService;
import co.udea.edu.sistemasdeinformacion.gestionproyectos.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/students")
    public List<UserEntity> getStudents() {
        return userService.getStudents();
    }

}
