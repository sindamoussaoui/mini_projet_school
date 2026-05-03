package edu.isgb.school.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import edu.isgb.school.entities.Instructor;
import java.util.List;

public interface InstructorRepository extends JpaRepository<Instructor, Integer> {
    List<Instructor> findByName(String name);
}