package com.shahab.cruddemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.shahab.cruddemo.dao.StudentDAO;
import com.shahab.cruddemo.entity.Student;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner -> {
			createStudent(studentDAO);
		};
	}

	public void createStudent(StudentDAO studentDAO) {

		System.out.println("Creating new student object");
		Student tempStudent = new Student("mohammed", "shahab", "something@gmail.com");

		System.out.println("Saving the student in the database");
		studentDAO.save(tempStudent);

		System.out.println("The id of the saved student is: " + tempStudent.getId());

	}
}
