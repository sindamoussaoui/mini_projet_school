package edu.isgb.school.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import edu.isgb.school.entities.School;

public interface SchoolRepository extends JpaRepository<School, Integer> {
}