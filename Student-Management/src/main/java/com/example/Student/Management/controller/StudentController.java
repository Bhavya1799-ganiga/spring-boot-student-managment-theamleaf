package com.example.Student.Management.controller;

import com.example.Student.Management.model.Student;
import com.example.Student.Management.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.method.support.ModelAndViewContainer;
import org.thymeleaf.engine.ModelBuilderTemplateHandler;

/**
 * Make this class as Spring MVC class.
 */
@Controller
public class StudentController {

    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService){
        super();
        this.studentService = studentService;
    }

    //handler methods to return list of Student in mode and view.
    /**
     * All templates are present under templates folder in resources
     * @param model
     * @return
     */
    @GetMapping("/list/students")
    public String getStudentList(Model model){
        Iterable<Student> students = studentService.getStudentList();
        System.out.println(students.toString());
        model.addAttribute("students",students);
    return "students";
    }
}
