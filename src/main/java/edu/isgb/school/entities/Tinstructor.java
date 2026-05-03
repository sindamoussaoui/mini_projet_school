package edu.isgb.school.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Tinstructor")
public class Tinstructor {

    // PK
    @Id
    @Column(name = "id_instructor")
    private Integer idInstructor;

    // FK → course
    @Column(name = "id_course")
    private Integer idCourse;

    public Tinstructor() {}

    public Integer getIdInstructor() {
        return idInstructor;
    }

    public void setIdInstructor(Integer idInstructor) {
        this.idInstructor = idInstructor;
    }

    public Integer getIdCourse() {
        return idCourse;
    }

    public void setIdCourse(Integer idCourse) {
        this.idCourse = idCourse;
    }
}