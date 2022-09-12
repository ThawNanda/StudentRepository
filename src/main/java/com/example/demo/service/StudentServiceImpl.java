package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	private StudentRepository studentRepository;

	@Override
	public void addStudent(Student student) {
		studentRepository.save(student);
	}

}
