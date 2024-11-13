package com.example.Student.Management.service;

import com.example.Student.Management.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

public interface StudentService {

    List<Student> getStudentList();

    Student saveStudent(Student student);

    Student getStudentById(Long id);
    Student updateStudent(Student student);
}
