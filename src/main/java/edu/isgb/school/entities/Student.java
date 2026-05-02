package edu.isgb.school.entities.cas1;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pk_student")
    private Integer idStudent;

    @Column(name = "cl_name_school")
    private String name;

    @Temporal(TemporalType.DATE)
    @Column(name = "cl_birthdate")
    private Date birthDate;

    public Student() {}

    // getters & setters
}