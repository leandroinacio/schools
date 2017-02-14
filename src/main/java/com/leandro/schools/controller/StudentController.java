package com.leandro.schools.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.leandro.schools.model.Student;
import com.leandro.schools.repository.StudentRepo;

@Controller
public class StudentController {

	@Autowired
	private StudentRepo studentRepo;
	
	@PostMapping("/fetchAllStudents")
	public @ResponseBody List<Student> fetchAllStudents() {
		return studentRepo.findAll();
	}
	
	@PostMapping("/fetchStudentById")
	public @ResponseBody Student fetchStudentById(Long id) {
		return studentRepo.findOne(id);
	}
	
	@PostMapping("/insertStudent")
	public @ResponseBody Student insertStudent(String name, String email) {
		Student student = new Student(0L, name, email);
		return studentRepo.save(student);
	}
	
	@PostMapping("/updateStudent")
	public @ResponseBody Student updateStudent(Long id, String name, String email) {
		Student student = studentRepo.findOne(id);
		student.setName(name);
		student.setEmail(email);
		return studentRepo.save(student);
	}
	
	@PostMapping("/deleteStudent")
	public @ResponseBody Boolean deleteStudent(Long id) {
		studentRepo.delete(id);
		return true;
	}
}
