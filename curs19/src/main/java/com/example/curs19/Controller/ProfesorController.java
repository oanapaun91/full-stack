package com.example.curs19.Controller;

import com.example.curs19.Model.Materie;
import com.example.curs19.Model.Profesor;
import com.example.curs19.Repository.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/profesor")
public class ProfesorController {
    private ProfesorRepository profesorRepository;

    @Autowired
    public ProfesorController(ProfesorRepository profesorRepository){
        this.profesorRepository = profesorRepository;
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Optional<Profesor>> getProfesor(@PathVariable Integer id) {
        Profesor profesor = profesorRepository.findById(id).orElseThrow();
        return new ResponseEntity(profesor, HttpStatus.ACCEPTED);
    }

    @GetMapping(path = "materii/{id}")
    public List<String> getMaterie(@PathVariable Integer id){
        if (checkProfesor(id)) {
            return profesorRepository.findMaterieByIdProfesor(id);
        }
        return null;
    }

    public boolean checkProfesor(Integer id){
        Optional<Profesor> profesor = profesorRepository.findById(id);
        if (profesor.isPresent()){
            return true;
        }
        return false;
    }
}
