package com.example.practice.controller;

import com.example.practice.model.Student;
import com.example.practice.repository.StudentRepository;
import com.example.practice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;  // ✅ You must import this

@RestController
@RequestMapping("/api/student")
@CrossOrigin(origins="*")
public class StudentController {

    @Autowired
    private StudentService studentService;


    @PostMapping
    public ResponseEntity<String> createUser(@RequestBody Student student) {
        studentService.createUser(student);
        return ResponseEntity.status(HttpStatus.CREATED).body("User added Successfully");
    }

    @GetMapping
    public List<Student> getDetails() {
        return studentService.getDetails();
    }

    @GetMapping("/id/{id}")
    public Student getDetailsById(@PathVariable String id) {
        return studentService.getDetailsById(id);
    }


    @DeleteMapping
    public ResponseEntity<String> deleteUsers() {
        studentService.deleteUsers();
        return ResponseEntity.status(HttpStatus.CREATED).body("Users delete successful");
    }

    @DeleteMapping("/{id}")
    public String deleteByUserId(@PathVariable String id)
    {
       return studentService.deleteByUserId(id);

    }

    @PutMapping("/{id}")
    public String updateUser(@PathVariable String id,@RequestBody Student student)
    {
        return studentService.updateUser(id,student);
    }

}
