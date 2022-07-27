package com.finite.student;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public record StudentService(StudentRepo studentRepo) {

	public List<Student> getStudents() {
		return studentRepo.findAll();
	}

	public void createStudent(Student student) {
		if (studentRepo.findStudentByName(student.getName()).isPresent()) {
			throw new IllegalStateException("duplicated student");
		}

		studentRepo.save(student);
	}

	public void deleteStudent(Long studentId) {
		studentRepo.deleteById(studentId);
	}
}
