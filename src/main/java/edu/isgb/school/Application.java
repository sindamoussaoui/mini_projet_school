package edu.isgb.school;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.isgb.school.entities.School;
import edu.isgb.school.entities.Department;
import edu.isgb.school.repositories.SchoolRepository;
import edu.isgb.school.repositories.DepartmentRepository;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    CommandLineRunner run(SchoolRepository schoolRepo, DepartmentRepository deptRepo) {
        return args -> {

            School school = new School();
            school.setName("ISGB");
            school.setPhone(123456);
            schoolRepo.save(school);

            Department dept = new Department();
            dept.setName("Informatique");
            dept.setSchool(school);
            deptRepo.save(dept);

            System.out.println("🔥 DATA INSERTED !");
        };
    }
        };

