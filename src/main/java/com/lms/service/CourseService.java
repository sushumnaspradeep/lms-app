package com.lms.service;

import org.springframework.stereotype.Service;

@Service
public class CourseService {
    public String getCourseList() {
        return "Course 1, Course 2, Course 3";
    }
}
