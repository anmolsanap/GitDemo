package com.eureka.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eureka.demo.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
