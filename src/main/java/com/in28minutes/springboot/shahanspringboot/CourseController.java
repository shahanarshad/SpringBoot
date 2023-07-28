package com.in28minutes.springboot.shahanspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;

//courses
//course : id, name, author 



@RestController
public class CourseController {

	
	
	@RequestMapping("/courses")
	public List <Course> retreiveAllCourses(){

		return Arrays.asList(
				new Course (1,"Learn AWS", "in28mins"),
				new Course (2,"Learn DevOps","in28Minutes")


				);
	}



}
