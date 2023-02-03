package com.driver.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.driver.Teacher;
import com.driver.Repository.TeacherRepo;

public class TeacherService {
    @Autowired
    TeacherRepo teacherRepo;
    
    public void addTeacher(Teacher teacher){
        teacherRepo.addTeacher(teacher);
    }

    public Teacher getTeacherByName(String name){
        return teacherRepo.getTeacherByName(name);
    }

    public void deleteTeacherByName(String name){
        teacherRepo.deleteTeacherByName(name);
    }

    public void deleteAllTeachers(){
        teacherRepo.deleteAllTeachers();
    }
}
