package edu.isgb.school.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import edu.isgb.school.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}