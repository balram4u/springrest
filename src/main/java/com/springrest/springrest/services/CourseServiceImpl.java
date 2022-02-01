package com.springrest.springrest.services;

import com.springrest.springrest.entity.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CourseServiceImpl  implements CourseService {

    List<Course> list;
  public CourseServiceImpl()
  {
     list=new ArrayList<>();
      list.add(new Course(145,"selenium","this is selenium course"));
      list.add(new Course(146,"java","this is java course"));


  }
    @Override
    public List<Course> getCourses() {
        return list;
    }
}
