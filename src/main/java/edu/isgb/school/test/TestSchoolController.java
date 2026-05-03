package edu.isgb.school.test;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import edu.isgb.school.entities.*;
import edu.isgb.school.service.SchoolService;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class TestSchoolController {

    private final SchoolService service;

    // School
    @PostMapping("/schools")
    public School createSchool(@RequestBody School s) {
        return service.createSchool(s);
    }

    @GetMapping("/schools/{id}")
    public School getSchool(@PathVariable Integer id) {
        return service.getSchool(id);
    }

    // Student
    @PostMapping("/students")
    public Student createStudent(@RequestBody Student s) {
        return service.createStudent(s);
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        return service.getAllStudents();
    }

    // Instructor
    @PostMapping("/instructors")
    public Instructor createInstructor(@RequestBody Instructor i) {
        return service.createInstructor(i);
    }

    @GetMapping("/instructors/search")
    public List<Instructor> findByName(@RequestParam String name) {
        return service.findByName(name);
    }

    @GetMapping("/instructors/{id}")
    public Instructor getInstructor(@PathVariable Integer id) {
        return service.getInstructor(id);
    }

    // Course
    @GetMapping("/courses/{id}")
    public Course getCourse(@PathVariable Integer id) {
        return service.getCourse(id);
    }

    @GetMapping("/instructors/{id}/courses")
    public List<Course> getCourses(@PathVariable Integer id) {
        return service.getCoursesByInstructor(id);
    }

    @PostMapping("/instructors/{id}/courses")
    public Instructor addCourse(@PathVariable Integer id, @RequestBody Course c) {
        return service.addCourse(id, c);
    }
}