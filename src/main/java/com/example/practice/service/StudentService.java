package com.example.practice.service;

import com.example.practice.model.Student;
import com.example.practice.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public void createUser(Student student) {
        studentRepository.save(student);
    }

    public List<Student> getDetails() {
        return studentRepository.findAll();
    }

    public Student getDetailsById(String id) {
      Optional<Student> student= studentRepository.findStudentOrNull(id);
      if(student.isPresent())
      {
          return student.get();
      }
      else {
          throw new RuntimeException("student is not found with id:"+id);
      }
    }



    public void deleteUsers() {
        studentRepository.deleteAll();
    }

    public String deleteByUserId(String id) {
        if(studentRepository.existsById(id))
        {
            studentRepository.deleteById(id);
            return "Deleted Successfully";
        }
        else
        {
            return "user not found";
        }



    }

    public String updateUser(String id,Student student) {
        Optional<Student> studentOptional=studentRepository.findById(id);
        if(studentOptional.isPresent())
        {
            Student update=studentOptional.get();
            update.setAge(student.getAge());
            update.setMobile(student.getMobile());
            update.setName(student.getName());
            update.setIdNo(student.getIdNo());
            update.setBloodGroup(student.getBloodGroup());
            studentRepository.save(update);
            return "user update successfully";
        }
        else
        {
            return "User Not Found With This Id:"+id;
        }
    }
}
