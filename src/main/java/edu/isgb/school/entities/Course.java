package edu.isgb.school.entities;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pk_course")
    private Integer idCourse;

    @Column(name = "name_course")
    private String name;

    @ManyToMany(mappedBy = "courses")
    private List<Instructor> instructors;

    public Course() {}

    public Course(String name) {
        this.name = name;
    }

    // GETTERS & SETTERS
}
