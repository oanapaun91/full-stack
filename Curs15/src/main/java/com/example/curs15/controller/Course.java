package com.example.curs15.controller;

import lombok.Data;

@Data
public class Course {
    String courseName;
    Trainer trainer;
    boolean online;
    CourseDays[] courseDays;
}
