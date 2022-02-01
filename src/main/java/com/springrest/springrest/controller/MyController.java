package com.springrest.springrest.controller;

import com.springrest.springrest.entity.Course;
import com.springrest.springrest.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class  MyController {
    @Autowired
    private CourseService courseService;
    @GetMapping("/courses")
    public List<Course> getcourses()
    {
return this.courseService.getCourses();

    }
}
