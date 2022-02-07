package com.bridgelabz.studentmanagement.controllers;

import com.bridgelabz.studentmanagement.services.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    IStudentService studentService;

    @GetMapping(value = { "", "/" })
    public String hello() {
        return studentService.helloWorld();
    }
}
