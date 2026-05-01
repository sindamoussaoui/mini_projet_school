package edu.isgb.school;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;

import edu.isgb.school.entities.*;
import edu.isgb.school.repositories.*;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    CommandLineRunner run(SchoolRepository schoolRepo, DepartmentRepository deptRepo) {
        return args -> {

            // Schools
            School s1 = new School();
            s1.setName("ISGB");
            s1.setPhone(123456);
            schoolRepo.save(s1);

            School s2 = new School();
            s2.setName("ISET");
            s2.setPhone(789101);
            schoolRepo.save(s2);

            // Departments
            Department d1 = new Department();
            d1.setName("Informatique");
            d1.setSchool(s1);

            Department d2 = new Department();
            d2.setName("Math");
            d2.setSchool(s1);

            Department d3 = new Department();
            d3.setName("Gestion");
            d3.setSchool(s2);

            deptRepo.save(d1);
            deptRepo.save(d2);
            deptRepo.save(d3);

            System.out.println("DONE ");
        };
    }
}
