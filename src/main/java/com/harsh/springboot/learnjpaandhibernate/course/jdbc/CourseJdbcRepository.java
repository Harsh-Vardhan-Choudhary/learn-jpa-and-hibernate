package com.harsh.springboot.learnjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.harsh.springboot.learnjpaandhibernate.course.Course;

@Repository
public class CourseJdbcRepository {
    
    @Autowired
    private JdbcTemplate springJdbcTemplate;

    private static String INSERT_QUERY = 
    """
        insert into course(ID, NAME, AUTHOR)
        values(?,?,?);
    """;

    private static String DELETE_QUERY = 
    """
            delete from course where ID = ?;
    """;

    public void insert(Course course) {
        springJdbcTemplate.update(INSERT_QUERY, course.getId(), course.getName(), course.getAuthor());
    }

    public void deleteByID(long id) {
        springJdbcTemplate.update(DELETE_QUERY, id);
    }

}