package com.campusride.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.campusride.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
