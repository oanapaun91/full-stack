package com.devmind;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
    private String lastName;
    private String firstName;
    private int grade;

    public Student() {
    }

    //  @Autowired(required = false)
    public Student(String lastName, String firstName, int grade) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.grade = grade;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }


}
