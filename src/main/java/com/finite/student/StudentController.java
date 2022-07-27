package com.finite.student;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public record StudentController(StudentService studentService) {

	@GetMapping
	public List<Student> getStudents() {
		return studentService.getStudents();
	}

	@PostMapping
	public void createStudent(@RequestBody Student student) {
		studentService.createStudent(student);
	}

	@DeleteMapping(path = "{studentId}")
	public void deleteStudent(@PathVariable("studentId") Long studentId) {
		studentService.deleteStudent(studentId);
	}
}
