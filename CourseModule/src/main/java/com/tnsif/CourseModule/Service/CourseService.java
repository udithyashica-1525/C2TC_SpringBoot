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
	
	//to get specific record
	public Course getCourseById(Long id) {
		return courseRepository.findById(id).orElse(null);
	}
	
	//to update record
	public Course updateCourse(Long id, Course course) {
		//tofetch existing record by id
		Course existingCourse = courseRepository.findById(id).orElse(null);
		
		//if course exists, update its fields
		if(existingCourse != null) {
			existingCourse.setName(course.getName());
			existingCourse.setDescription(course.getDescription());
			existingCourse.setInstructor(course.getInstructor());
			existingCourse.setPrice(course.getPrice());
			return courseRepository.save(existingCourse);			
		}
		
		//if course didn't exist, return null
		return null;
	}
	
	//to delete record by id 
	public void deleteCourse(Long id) {
		courseRepository.deleteById(id);
	}
}
