package com.example.practice.model;


import jakarta.persistence.*;
import lombok.Data;

@Table(name="student")
@Entity
public class Student {

    @Id
    private String idNo;
    private String name;
    private int age;
    private String mobile;
    private String bloodGroup;

    public Student() {}

    public Student(String idNo,int age, String mobile, String name,String bloodGroup) {
        this.idNo=idNo;
        this.age = age;
        this.mobile = mobile;
        this.name = name;
        this.bloodGroup=bloodGroup;
    }



    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
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

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }
}
