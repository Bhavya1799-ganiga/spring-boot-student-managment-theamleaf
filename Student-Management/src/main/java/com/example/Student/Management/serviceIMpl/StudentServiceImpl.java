package com.example.Student.Management.serviceIMpl;

import com.example.Student.Management.model.Student;
import com.example.Student.Management.repository.StudentRepository;
import com.example.Student.Management.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    /**
     * constructor based dependency injection
     */
    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository){
        super();
        this.studentRepository = studentRepository;
    }
    @Override
    public List<Student> getStudentList() {
        return studentRepository.findAll();
    }
}