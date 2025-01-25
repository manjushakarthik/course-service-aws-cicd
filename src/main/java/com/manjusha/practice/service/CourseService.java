package com.manjusha.practice.service;

import com.manjusha.practice.dto.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {

    private final List<Course> courses = new ArrayList();
    public void addCourse(Course course) {
        courses.add(course);
        System.out.println(courses);
    }
}
