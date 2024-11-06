package com.example.Student.Management;

import com.example.Student.Management.model.Student;
import com.example.Student.Management.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementApplication implements CommandLineRunner {

	@Autowired
	private StudentRepository studentRepository;

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		Student student = new Student("Bhavya","Manu","bh67@gmail.com","90767908787");
		studentRepository.save(student);

		Student student1 = new Student("Bhavya1","Manu1","bh167@gmail.com","9767908787");
		studentRepository.save(student1);

		Student student2 = new Student("Bhavya2","Manu2","bh267@gmail.com","967908787");
		studentRepository.save(student2);
	}
}
