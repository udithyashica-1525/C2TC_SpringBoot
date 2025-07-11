package com.tnsif.CourseModule.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tnsif.CourseModule.Entity.Course;


public interface CourseRepository extends JpaRepository<Course, Long> {

}
