package edu.isgb.school.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import edu.isgb.school.entities.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {
}