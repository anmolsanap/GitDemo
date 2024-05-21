package com.eureka.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.eureka.demo.model.Student;
import com.eureka.demo.service.StudentService;

@CrossOrigin("*")
@RestController
public class StudentController {
	
	@Autowired private StudentService studentService;

	@PostMapping("/saveStudent")
	public ResponseEntity<String> saveStudent(@RequestBody Student student)
	{
		studentService.saveStudent(student);
		return new ResponseEntity<String>("Student record saved successfully" ,HttpStatus.CREATED);
	}
	
	@GetMapping("/getStudents")
	public ResponseEntity<List<Student>> getAllStudent()
	{
		List<Student> studentList	= studentService.getAllStudent();
		return new ResponseEntity<List<Student>>(studentList,HttpStatus.OK);
	}
}
