package com.example.curs19.Repository;

import com.example.curs19.Model.Adresa;
import com.example.curs19.Model.Student;
import com.example.curs19.Model.StudentiToMaterie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    Optional<Student> findBycnp(String CNP);

    @Query(value = "SELECT * FROM studenti " +
            "JOIN adrese_studenti ON studenti.id_adresa = adrese_studenti.id " +
            "WHERE " +
            "studenti.nume = ?1 " +
            "AND adrese_studenti.localitate = ?2",
            nativeQuery = true)
    List<Optional<Student>> findByNumeAndLocalitate(String nume, String localitate);

    @Modifying
    @Transactional
    @Query(value = "INSERT INTO studenti_to_materii " +
            "VALUES(NULL, ?1, ?2) ",
            nativeQuery = true)
    void insertStudentiToMaterie (Integer student_id, Integer materie_id);

}
