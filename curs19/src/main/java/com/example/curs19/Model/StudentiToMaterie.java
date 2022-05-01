package com.example.curs19.Model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "studenti_to_materii")
@Data
public class StudentiToMaterie {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_student")
    private Student student;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_materie")
    private Materie materie;
}
