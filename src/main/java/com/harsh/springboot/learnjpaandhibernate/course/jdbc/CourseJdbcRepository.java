package com.harsh.springboot.learnjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {
    
    @Autowired
    private JdbcTemplate springJdbcTemplate;

    private static String INSERT_QUERY = 
    """
        insert into course(ID, NAME, AUTHOR)
        values(1,'Learn AWS', 'harsh');
    """;

    public void insert() {
        springJdbcTemplate.update(INSERT_QUERY);
    }

}

