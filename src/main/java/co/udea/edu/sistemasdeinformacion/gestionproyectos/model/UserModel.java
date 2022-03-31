package co.udea.edu.sistemasdeinformacion.gestionproyectos.model;

import co.udea.edu.sistemasdeinformacion.gestionproyectos.entity.RoleEntity;
import co.udea.edu.sistemasdeinformacion.gestionproyectos.entity.UserEntity;
import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import java.util.List;

@Data
public class UserModel {
    private String id;
    private String name;
    private String email;
    private String phone;
    private RoleEntity role;
}
