package com.eureka.demo.serviceImpl;

import java.util.List;
import java.util.Optional;

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

	@Override
	public Student updateStudent(int rollNo, Student student) {
			Optional<Student> student_ById = studentRepository.findById(rollNo);
			if(student_ById.isPresent()) return studentRepository.save(student);
			
			else System.out.println(rollNo + " is not present in record list");
			
			
		return new Student();
	}

	@Override
	public void deleteStudent(int rollNo) {
			Optional<Student> student = studentRepository.findById(rollNo);
			if(student.isPresent()) 
					studentRepository.deleteById(rollNo);
			
			else System.out.println(rollNo+" is not present so we are unable to delete");
	}

}
