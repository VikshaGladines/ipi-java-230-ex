package com.ipiecoles.java.java230.repository;

import com.ipiecoles.java.java230.model.Employe;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface EmployeRepository extends JpaRepository<Employe, Long> {
    Employe findByMatricule(String matricule);

    List<Employe> findByNomAndPrenom(String nom, String prenom);
}


