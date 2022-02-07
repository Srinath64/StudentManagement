package com.bridgelabz.studentmanagement.services;

import com.bridgelabz.studentmanagement.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService implements IStudentService {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public String helloWorld() {
        return "Hello World!";
    }
}

