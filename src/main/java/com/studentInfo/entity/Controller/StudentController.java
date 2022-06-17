package com.studentInfo.entity.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.studentInfo.entity.Student;

@RestController
@CrossOrigin("*")
public class StudentController {

	@Autowired
	public StudentDao studentDao;
	
	@GetMapping("/students")
	public List<Student> getStudent()
	{
		return studentDao.findAll();
	}
	
	@PostMapping("/student")
	public Student addStudent(@RequestBody Student student)
	{
		return studentDao.save(student);
	}
}
