package com.springrest.springrest.services;

import com.springrest.springrest.entity.Course;

import java.util.List;

public interface CourseService {
    public List<Course> getCourses();
    public Course getCourse(long courseID);
}
