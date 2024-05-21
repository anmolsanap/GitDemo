package com.eureka.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eureka.demo.model.Student;
import com.eureka.demo.repository.StudentRepository;
import com.eureka.demo.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired private StudentRepository studentRepository;

	@Override
	public void saveStudent(Student student) {
		
		studentRepository.save(student);
	}

	@Override
	public List<Student> getAllStudent() {
		
		return studentRepository.findAll();
	}

}
