package com.example.demo.controller;

import com.example.demo.entity.Student;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @PostMapping
    public String addStudent(
            @Valid @RequestBody Student student) {

        return "Student Validated Successfully";
    }
}