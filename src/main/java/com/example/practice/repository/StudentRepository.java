package com.example.practice.repository;

import com.example.practice.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, String> {


    @Query("select s from Student s where s.idNo=:id")
    Optional<Student> findStudentOrNull(@Param("id") String id);





}
