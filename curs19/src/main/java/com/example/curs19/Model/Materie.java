package com.example.curs19.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Data
@Entity
    @Table(name = "materii")
public class Materie {
    @Id
    @Column(name = "id")
    private Integer id;
    @GeneratedValue (strategy = GenerationType.IDENTITY)


    @Column (name = "nume")
    private String nume;

    @ManyToOne
    @JoinColumn(name = "id_profesor")
    public Profesor profesor;

    @ManyToMany(mappedBy = "cursuriAlese", fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<Student> studentiInrolati;

    @OneToMany(mappedBy = "materie")
    @JsonIgnore
    private Set<StudentiToMaterie> inscrieri;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Materie materie = (Materie) o;
        return id.equals(materie.id) && nume.equals(materie.nume);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nume);
    }
}
