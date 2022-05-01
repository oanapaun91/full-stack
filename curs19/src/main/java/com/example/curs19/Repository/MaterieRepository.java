package com.example.curs19.Repository;

import com.example.curs19.Model.Materie;
import com.example.curs19.Model.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MaterieRepository extends JpaRepository<Materie, Integer> {

}
