package com.hibernate.repository;

import com.hibernate.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class CourseRepository {

    @Autowired
    EntityManager em;

    public Course findById(Long id){
        return em.find(Course.class,id);
    }
}
