package edu.isgb.school.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Instructor")
public class Instructor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pk_instructor")
    private Integer idInstructor;

    @Column(name = "name_instructor")
    private String name;

    public Instructor() {}

    public Integer getIdInstructor() {
        return idInstructor;
    }

    public void setIdInstructor(Integer idInstructor) {
        this.idInstructor = idInstructor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}