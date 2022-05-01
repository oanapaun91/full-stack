package com.example.curs19.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "adrese_studenti")
public class Adresa {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "strada")
    private String strada;

    @Column(name = "numar")
    private String numar;

    @Column(name = "localitate")
    private String localitate;

    @OneToOne(mappedBy = "adresa")
    @JsonIgnore
    private Student student;


}
