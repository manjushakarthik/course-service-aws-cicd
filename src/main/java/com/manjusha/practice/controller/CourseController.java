package com.manjusha.practice.controller;

import com.manjusha.practice.dto.Course;
import com.manjusha.practice.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/courses")
public class CourseController {


    @Autowired
    private CourseService courseService;
    @PostMapping(produces = "application/json", consumes = "application/json")
    public ResponseEntity<Course> addCourse(@RequestBody Course course) {
        courseService.addCourse(course);
        return new ResponseEntity<>(course, HttpStatus.CREATED);
    }

    @GetMapping("/welcome")
    public String greetings() {
        return "Hello Techie , AWS CICD Example working fine !";
    }
}
