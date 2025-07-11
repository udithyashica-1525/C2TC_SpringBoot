package com.tnsif.CourseModule.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tnsif.CourseModule.Entity.Course;
import com.tnsif.CourseModule.Service.CourseService;

@RestController
public class CourseController {

	@Autowired
	private CourseService courseService;
	
	@PostMapping("/course")
	public Course createCourse(@RequestBody Course course) {
		return  courseService.saveCourse(course);
	}
	
	@GetMapping("/course")
	public List<Course> getAllCourses(){
		return courseService.getAllCourse();
	}
	
	@GetMapping("/course/{id}")
	public Course getCourseById(@PathVariable Long id) {
		return courseService.getCourseById(id);
	}
	@PutMapping("/course/{id}")
	public Course updatecourse(@PathVariable Long id, @RequestBody Course course) {
		return courseService.updateCourse(id, course);
	}
	
	@DeleteMapping("/course/{id}")
	public void deletecourse(@PathVariable Long id) {
		courseService.deleteCourse(id);
	}
}
                                                                                                        