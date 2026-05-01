package edu.isgb.school.entities;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PK_Student")
    private Integer idStudent;

    @Column(name = "cl_name_school", nullable = false)
    private String name;

    @Temporal(TemporalType.DATE)
    @Column(name = "cl_birthdate")
    private Date birthDate;

    // CAS 1 : relation OneToOne unidirectionnelle

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_PK_ADDRESS", referencedColumnName = "PK_ADDRESS")
    private Address address;

    public Student() {}

    public Student(String name, Date birthDate, Address address) {
        this.name = name;
        this.birthDate = birthDate;
        this.address = address;
    }

    public Integer getIdStudent() { return idStudent; }
    public void setIdStudent(Integer idStudent) { this.idStudent = idStudent; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Date getBirthDate() { return birthDate; }
    public void setBirthDate(Date birthDate) { this.birthDate = birthDate; }

    public Address getAddress() { return address; }
    public void setAddress(Address address) { this.address = address; }
}
