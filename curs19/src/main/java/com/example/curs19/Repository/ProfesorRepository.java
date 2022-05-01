package com.example.curs19.Repository;

import com.example.curs19.Model.Materie;
import com.example.curs19.Model.Profesor;
import com.example.curs19.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProfesorRepository extends JpaRepository<Profesor, Integer> {


    @Query (value = "SELECT materii.nume FROM materii " +
            "WHERE materii.id_profesor = ?1", nativeQuery = true)
    List<String> findMaterieByIdProfesor(Integer id);
}
