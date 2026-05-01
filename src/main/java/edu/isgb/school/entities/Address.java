package edu.isgb.school.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
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

    @JsonIgnore
    @OneToOne(mappedBy = "address", fetch = FetchType.LAZY)
    private Student student;

    public Address() {}

    // getters & setters
}