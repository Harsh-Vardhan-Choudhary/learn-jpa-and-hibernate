package com.harsh.springboot.learnjpaandhibernate.course;

public class Course {
    private long id;
    private String name;
    private String Author;

    //constructor
    //getters
    //to string

    public Course() {

    }

    public Course(long id, String name, String author) {
        this.id = id;
        this.name = name;
        Author = author;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return Author;
    }

    @Override
    public String toString() {
        return "Course [id=" + id + ", name=" + name + ", Author=" + Author + "]";
    }

    

    
}
