package com.tnsif.CourseModule.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tnsif.CourseModule.Entity.Course;
import com.tnsif.CourseModule.Repository.CourseRepository;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;
	
	//to save the record
	public Course saveCourse(Course course) {
		return courseRepository.save(course);
	}
	
	//to retrive all records
	public List<Course> getAllCourse(){
		return courseRepository.findAll();
	}
}
