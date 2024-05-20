package com.harsh.springboot.learnjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.harsh.springboot.learnjpaandhibernate.course.Course;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {


    @Autowired
    private CourseJdbcRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1, "Learn AWS - now", "Harsh"));
        repository.insert(new Course(2, "Learn Devops", "Harsh"));
        repository.insert(new Course(3, "Learn Docker", "Harsh"));

        repository.deleteByID(1);

    }
}