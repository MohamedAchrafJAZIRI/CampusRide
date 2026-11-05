package com.campusride.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.campusride.model.Student;
import com.campusride.service.StudentService;

@RestController
@RequestMapping("/api/students")
public class StudentController extends CrudController<Student> {
    public StudentController(StudentService service) {
        super(service);
    }
}
