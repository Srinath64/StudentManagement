package com.bridgelabz.studentmanagement.repository;

import com.bridgelabz.studentmanagement.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
