package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@Controller
public class StudentController 
{
	   @Autowired
	  StudentService  studentService;
	   
	  
	 // @RequestMapping(value="/display", method= RequestMethod.GET)
	 @GetMapping("/display")       //  Handler  
	   public String display()
	  {
		  try
		  {
			  Student  student = new Student();
			 // student.setStduentId(1);
			  student.setStudentName("Aman");
			  student.setStudentEmail("abc@gmail.com");
			  
			  studentService.addStudent(student);
		  }
		  catch(Exception e)
		  {
			   System.out.println("--------------"+e);
		  }
		 
		  
		  
		  return "base";
	  }
	   @GetMapping("/home")       //  Handler  
	   public String home()
	  {
		   return "home"; 
	  
	  }
}
