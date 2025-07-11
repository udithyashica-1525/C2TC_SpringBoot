package com.tnsif.CourseModule.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
}
                                                                                                        