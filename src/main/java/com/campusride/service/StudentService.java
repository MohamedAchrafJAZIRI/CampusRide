package com.campusride.service;

import org.springframework.stereotype.Service;

import com.campusride.model.Student;
import com.campusride.repository.StudentRepository;

@Service
public class StudentService extends CrudService<Student> {
    public StudentService(StudentRepository repo) {
        super(repo);
    }
}
