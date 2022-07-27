package com.finite.student;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "students")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private Integer age;
}
