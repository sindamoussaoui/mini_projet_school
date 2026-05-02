package edu.isgb.school.entities.cas1;

import jakarta.persistence.*;

@Entity
@Table(name = "Address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pk_address")
    private Integer idAddress;

    @Column(name = "cl_street")
    private String street;

    @Column(name = "cl_city")
    private String city;

    @Column(name = "cl_postal_code")
    private String postalCode;

    // FK UNIQUE ONLY ONCE
    @OneToOne
    @JoinColumn(name = "student_pk_student", referencedColumnName = "pk_student")
    private Student student;

    public Address() {}

    // getters & setters
}