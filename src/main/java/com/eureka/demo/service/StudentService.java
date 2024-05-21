package com.eureka.demo.service;

import java.util.List;

import com.eureka.demo.model.Student;

public interface StudentService {

	public void saveStudent(Student student);

	public List<Student> getAllStudent();

	public Student updateStudent(int rollNo, Student student);

	public void deleteStudent(int rollNo);

}
