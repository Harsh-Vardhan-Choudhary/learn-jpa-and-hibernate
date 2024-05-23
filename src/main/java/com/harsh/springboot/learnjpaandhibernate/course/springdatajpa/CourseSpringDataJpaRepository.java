package com.harsh.springboot.learnjpaandhibernate.course.springdatajpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.harsh.springboot.learnjpaandhibernate.course.Course;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {

    //Define custom query methods by following naming conventions
    List<Course> findByAuthor(String author);
    List<Course> findByName(String name);
}
