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


    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    @Override
    public String toString() {
        return "Course [id=" + id + ", name=" + name + ", Author=" + Author + "]";
    }

    

    
}
