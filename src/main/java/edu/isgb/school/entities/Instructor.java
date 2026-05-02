package edu.isgb.school.entities;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "Instructor")
public class Instructor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pk_instructor")
    private Integer idInstructor;

    @Column(name = "name_instructor")
    private String name;

    // ManyToMany (OWNER SIDE)
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(
            name = "t_instructor_t_course",
            joinColumns = @JoinColumn(name = "fk_instructor"),
            inverseJoinColumns = @JoinColumn(name = "fk_course")
    )
    private List<Course> courses;

    public Instructor() {}

    public Instructor(String name) {
        this.name = name;
    }

    // GETTERS & SETTERS

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

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}