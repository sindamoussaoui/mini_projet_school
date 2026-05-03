package edu.isgb.school.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import edu.isgb.school.entities.*;
import edu.isgb.school.repositories.*;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SchoolService {

    private final SchoolRepository schoolRepo;
    private final StudentRepository studentRepo;
    private final InstructorRepository instructorRepo;
    private final CourseRepository courseRepo;
    private final DepartmentRepository departmentRepo;

    // School
    public School createSchool(School s) {
        return schoolRepo.save(s);
    }

    public School getSchool(Integer id) {
        return schoolRepo.findById(id).orElse(null);
    }

    // Student
    public Student createStudent(Student s) {
        return studentRepo.save(s);
    }

    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    // Instructor
    public Instructor createInstructor(Instructor i) {
        return instructorRepo.save(i);
    }

    public List<Instructor> findByName(String name) {
        return instructorRepo.findByName(name);
    }

    public Instructor getInstructor(Integer id) {
        return instructorRepo.findById(id).orElse(null);
    }

    // Course
    public Course getCourse(Integer id) {
        return courseRepo.findById(id).orElse(null);
    }

    public List<Course> getCoursesByInstructor(Integer id) {
        Instructor i = instructorRepo.findById(id).orElse(null);
        return (i != null) ? i.getCourses() : null;
    }

    public Instructor addCourse(Integer id, Course c) {
        Instructor i = instructorRepo.findById(id).orElse(null);
        if (i != null) {
            courseRepo.save(c);
            i.getCourses().add(c);
            return instructorRepo.save(i);
        }
        return null;
    }
}