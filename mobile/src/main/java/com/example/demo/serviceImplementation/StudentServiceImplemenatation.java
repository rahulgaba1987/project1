package com.example.demo.serviceImplementation;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;

@Service
public class StudentServiceImplemenatation  implements StudentService
{
	@Autowired
	StudentRepository  repo;

	@Override
	public void addStudent(Student student) 
	{
		// TODO Auto-generated method stub
		
		repo.save(student);
		
		
		
	}
	
	

}
