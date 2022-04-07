package co.udea.edu.sistemasdeinformacion.gestionproyectos.service;

import co.udea.edu.sistemasdeinformacion.gestionproyectos.entity.UserEntity;
import co.udea.edu.sistemasdeinformacion.gestionproyectos.repository.UserRepositoryJPA;
import com.heroku.api.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepositoryJPA userRepositoryJPA;

    public List<UserEntity> getStudents(){
        List<UserEntity> listaUser = userRepositoryJPA.getAllStudents();
        return listaUser;
    }
}
