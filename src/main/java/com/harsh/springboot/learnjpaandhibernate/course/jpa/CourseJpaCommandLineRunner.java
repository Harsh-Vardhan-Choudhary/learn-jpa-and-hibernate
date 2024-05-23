package com.harsh.springboot.learnjpaandhibernate.course.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.harsh.springboot.learnjpaandhibernate.course.Course;

@Component
public class CourseJpaCommandLineRunner implements CommandLineRunner {
    
    @Autowired
    private CourseJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1, "Learn AWS - now", "Harsh"));
        repository.insert(new Course(2, "Learn Devops", "Harsh"));
        repository.insert(new Course(3, "Learn Docker", "Harsh"));

        repository.delete(1);

        System.out.println(repository.select(2));
        System.out.println(repository.select(3));

    }
}