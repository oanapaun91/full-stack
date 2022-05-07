package com.example.curs19.Controller;

import com.example.curs19.Model.Adresa;
import com.example.curs19.Model.Materie;
import com.example.curs19.Model.Student;
import com.example.curs19.Model.StudentiToMaterie;
import com.example.curs19.Repository.MaterieRepository;
import com.example.curs19.Repository.StudentRepository;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/student")
public class StudentController {
   StudentRepository studentRepository;
   @Autowired
   MaterieRepository materieRepository;

   @Autowired
   public StudentController(StudentRepository studentRepository) {
      this.studentRepository = studentRepository;
   }

   @PostMapping(path = "/enroll")
   public ResponseEntity<String> addStudentToMaterie(@RequestParam(name = "studentId") Integer studentId
           , @RequestParam(name = "materieId") Integer materieId) {
      Optional<Student> student = studentRepository.findById(studentId);
      Optional<Materie> materie = materieRepository.findById(materieId);
      if (student.isPresent() && materie.isPresent()){
         studentRepository.insertStudentiToMaterie(studentId, materieId);
         return new ResponseEntity<>("Studentul " +studentId + " participa la cursul " + materieId, HttpStatus.OK);

      }
      return new ResponseEntity<>("Studentul " +studentId + " nu poate participa la cursul ", HttpStatus.BAD_REQUEST);
   }

   @PostMapping
   public ResponseEntity<Student> addStudent(@RequestBody Student student) {
      if (!studentRepository.findBycnp(student.getCnp()).isPresent()){
         studentRepository.saveAndFlush(student);
         return new ResponseEntity<>(student, HttpStatus.OK);
      }
      return new ResponseEntity<>(student,HttpStatus.BAD_REQUEST);

   }

   @PutMapping(path = "/{studentId}/adresa")
   public ResponseEntity<Object> updateAddress(@PathVariable Integer studentId, @RequestBody Adresa adresa) {
      Optional<Student> studentToUpdate = studentRepository.findById(studentId);
      if (studentToUpdate.isPresent()) {
         Student updatedStudent = studentToUpdate.get();
         updatedStudent.getAdresa().setLocalitate(adresa.getLocalitate());
         updatedStudent.getAdresa().setNumar(adresa.getNumar());
         updatedStudent.getAdresa().setStrada(adresa.getStrada());
         studentRepository.saveAndFlush(updatedStudent);
         return new ResponseEntity<>(updatedStudent, HttpStatus.OK);
      }
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
   }

   @DeleteMapping(path = "/{studentId}")
   public ResponseEntity<Object> deleteStudent(@PathVariable Integer studentId) {
      Optional<Student> studentToDelete = studentRepository.findById(studentId);
      if (studentToDelete.isPresent()) {
         studentRepository.deleteById(studentId); //arunca eroare?
         return new ResponseEntity<>(studentToDelete.get(), HttpStatus.OK);
      }
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
   }
}
