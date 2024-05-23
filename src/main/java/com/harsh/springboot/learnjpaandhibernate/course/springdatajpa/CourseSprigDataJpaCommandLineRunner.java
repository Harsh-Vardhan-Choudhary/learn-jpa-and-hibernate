package com.harsh.springboot.learnjpaandhibernate.course.springdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.harsh.springboot.learnjpaandhibernate.course.Course;

@Component
public class CourseSprigDataJpaCommandLineRunner implements CommandLineRunner {
    
    @Autowired
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(1, "Learn AWS - now", "Harsh"));
        repository.save(new Course(2, "Learn Devops", "Harsh"));
        repository.save(new Course(3, "Learn Docker", "Harsh"));

        repository.deleteById(1l);

        System.out.println(repository.findById(2l));
        System.out.println(repository.findById(3l));

        System.out.println(repository.findAll());
        System.out.println(repository.count());

        System.out.println(repository.findByAuthor("harsh"));
        System.out.println(repository.findByAuthor(""));

        System.out.println(repository.findByName("Devops"));
        System.out.println(repository.findByName(""));
    }
}