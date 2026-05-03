package edu.isgb.school.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import edu.isgb.school.entities.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> {
}