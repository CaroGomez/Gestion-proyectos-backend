package co.udea.edu.sistemasdeinformacion.gestionproyectos.repository;

import co.udea.edu.sistemasdeinformacion.gestionproyectos.entity.ProjectEntity;
import co.udea.edu.sistemasdeinformacion.gestionproyectos.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepositoryJPA extends JpaRepository<UserEntity, String> {

    @Query("SELECT u FROM UserEntity AS u WHERE u.role.id = 1")
    List<UserEntity> getAllStudents();
}
