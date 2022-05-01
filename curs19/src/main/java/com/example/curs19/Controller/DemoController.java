package com.example.curs19.Controller;

import com.example.curs19.Model.Student;
import com.example.curs19.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping(path = "/demo")

public class DemoController {
    @PersistenceContext
    EntityManager entityManager;

    StudentRepository studentRepository;

    @Autowired
    public DemoController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping(path = "/student/all")
    public @ResponseBody
    Iterable<Student> getStudents() {
        return studentRepository.findAll();
    }

//    @GetMapping(path = "/student")
//    public @ResponseBody <Optional<Student>> getStudentByNumeAndPrenume(@RequestParam(name = "nume") String nume, @RequestParam(name = "prenume", required = false) String prenume) {
//        if (prenume == null) {
//            return  studentRepository.findByNume(nume);
//        }
//        return studentRepository.findByNumeAndPrenume(nume, prenume);
//    }

    @GetMapping(path = "/student/localitate")
    public @ResponseBody
    List<Optional<Student>> getStudentByNumeAndPrenume(@RequestParam(name = "nume") String nume, @RequestParam(name = "localitate") String localitate) {
        return studentRepository.findByNumeAndLocalitate(nume, localitate);
    }

}
