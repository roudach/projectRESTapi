package com.example.tplocationvoiture.repository;

import com.example.tplocationvoiture.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
