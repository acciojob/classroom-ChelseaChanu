package com.driver.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.driver.Student;
import com.driver.Repository.StudentRepo;

@Service
public class StudentService {
    @Autowired
    StudentRepo studentRepo;

    public void addStudent(Student student){
        studentRepo.addStudent(student);
    }

    public Student getStudentByName(String name){
        return studentRepo.getStudentByName(name);
    }

    public List<String> getAllstudents(){
        return studentRepo.getAllstudents();
    }
}
