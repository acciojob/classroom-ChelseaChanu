package com.driver.Repository;

import java.util.*;

import org.springframework.stereotype.Repository;

import com.driver.Student;

@Repository
public class StudentRepo {
    List<Student> studentDB = new ArrayList<>();

    public void addStudent(Student student){
        studentDB.add(student);
    }

    public Student getStudentByName(String name){
        for(Student student:studentDB){
            if(student.getName().equals(name))
                return student;
        }
        return null;
    }

    public List<String> getAllstudents(){
        List<String> studentList = new ArrayList<String>();
        for(Student student:studentDB){
            studentList.add(student.getName());
        }
        return studentList;
    }
}
