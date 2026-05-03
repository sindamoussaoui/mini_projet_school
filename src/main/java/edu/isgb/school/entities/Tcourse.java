
package edu.isgb.school.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Tcourse")
public class Tcourse {

    // PK
    @Id
    @Column(name = "id_course")
    private Integer idCourse;

    // FK → instructor
    @Column(name = "id_instructor")
    private Integer idInstructor;

    public Tcourse() {}

    public Integer getIdCourse() {
        return idCourse;
    }

    public void setIdCourse(Integer idCourse) {
        this.idCourse = idCourse;
    }

    public Integer getIdInstructor() {
        return idInstructor;
    }

    public void setIdInstructor(Integer idInstructor) {
        this.idInstructor = idInstructor;
    }
}