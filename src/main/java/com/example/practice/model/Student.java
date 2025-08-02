package com.example.practice.model;


import jakarta.persistence.*;
import lombok.Data;

@Table(name="student")
@Entity
public class Student {

    @Id
    private Long idNo;
    private String name;
    private int age;
    private String mobile;

    public Student() {}

    public Student(Long idNo,int age, String mobile, String name) {
        this.idNo=idNo;
        this.age = age;
        this.mobile = mobile;
        this.name = name;
    }



    public Long getIdNo() {
        return idNo;
    }

    public void setIdNo(Long idNo) {
        this.idNo = idNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
