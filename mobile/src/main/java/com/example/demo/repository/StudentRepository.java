package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.entity.Student;



public interface StudentRepository extends JpaRepository<Student ,Integer>
{

}

//  1. Controller  2. Entity, 3. service (interface)  4. ServiceImplemenattaion(Class) 5. Repository(interface)
