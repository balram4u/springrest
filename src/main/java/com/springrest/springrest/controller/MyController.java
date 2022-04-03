package com.springrest.springrest.controller;

import com.springrest.springrest.entity.Course;
import com.springrest.springrest.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping("/courses/{courseID}")
    public Course getCourse(@PathVariable long courseID)
    {
        return this.courseService.getCourse(courseID);
    }
    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course)
    {
        return this.courseService.addCourse(course);
    }
    @PutMapping("/courses")
    public Course updateCourse(@RequestBody Course course)
    {
        return this.courseService.updateCourse(course);
    }
    @DeleteMapping("/courses/{courseID}")
     public ResponseEntity<HttpStatus> deleteCourse(@PathVariable long courseID)
     {
        try {
            this.courseService.deleteCourse(courseID);
            return new ResponseEntity<>(HttpStatus.OK);
           }
            catch(Exception e)
            {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
}
