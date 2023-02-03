package com.driver.Repository;

import java.util.*;

import org.springframework.stereotype.Repository;

@Repository
public class TeacherStudentRepo {
    HashMap<String,List<String>> teacherStudentDB = new HashMap<>();

    public void addStudentTeacherPair(String student, String teacher){
        List<String> studentList;
        if(teacherStudentDB.containsKey(teacher)){
            teacherStudentDB.get(teacher).add(student);
        }
        else{
            studentList = new ArrayList<>();
            studentList.add(student);
            teacherStudentDB.put(teacher,studentList);
        }
    }

    public List<String> getStudentByTeacherName(String teacher){
        if(teacherStudentDB.containsKey(teacher)){
            return teacherStudentDB.get(teacher);
        }
        return null;
    }
}
