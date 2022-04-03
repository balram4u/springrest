package com.springrest.springrest.services;

import com.springrest.springrest.entity.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CourseServiceImpl  implements CourseService {

    List<Course> list;
  public CourseServiceImpl()
  {
      list=new ArrayList<>();
      list.add(new Course(145,"selenium","This is selenium course"));
      list.add(new Course(146,"java","This is java course"));
      list.add(new Course(147,"python","This is python course"));
  }
    @Override
    public List<Course> getCourses() {
        return list;
    }

    @Override
    public Course getCourse(long courseID) {
      Course c=null;
      for(Course course:list)
      {
          if(course.getId()==courseID)
          {
              c=course;
              break;
          }
      }
        return c;
    }

    @Override
    public Course addCourse(Course course) {
      list.add(course);
        return course;
    }

    @Override
    public Course updateCourse(Course course) {
      list.forEach(e->{
          if(e.getId()==course.getId());
          {
              e.setTitle(course.getTitle());
              e.setDescription(course.getDescription());
          }
      });
        return course;
    }

    @Override
    public void deleteCourse(long courseID) {
        list=list.stream().filter(e -> e.getId()!=courseID).collect(Collectors.toList());
    }
}
