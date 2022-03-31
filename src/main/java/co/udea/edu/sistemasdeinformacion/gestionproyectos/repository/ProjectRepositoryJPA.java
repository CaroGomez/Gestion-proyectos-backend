package co.udea.edu.sistemasdeinformacion.gestionproyectos.repository;

import co.udea.edu.sistemasdeinformacion.gestionproyectos.entity.ProjectEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepositoryJPA extends JpaRepository<ProjectEntity, Integer> {

}