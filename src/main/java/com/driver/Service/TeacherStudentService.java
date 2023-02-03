package com.driver.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.driver.Repository.TeacherStudentRepo;

public class TeacherStudentService {
    
    @Autowired
    TeacherStudentRepo teacherStudentRepo;

    public void addStudentTeacherPair(String student, String teacher){
        teacherStudentRepo.addStudentTeacherPair(student, teacher);
    }

    public List<String> getStudentByTeacherName(String teacher){
        return teacherStudentRepo.getStudentByTeacherName(teacher);
    }

}
