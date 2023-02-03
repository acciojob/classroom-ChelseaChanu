package com.driver.Repository;

import java.util.*;

import com.driver.Teacher;

public class TeacherRepo {
    List<Teacher> teacherDB = new ArrayList<>();

    public void addTeacher(Teacher teacher){
        teacherDB.add(teacher);
    }

    public Teacher getTeacherByName(String name){
        for(Teacher teacher:teacherDB){
            if(teacher.getName().equals(name))
                return teacher;
        }
        return null;
    }

    public void deleteTeacherByName(String name){
        for(Teacher teacher:teacherDB){
            if(teacher.getName().equals(name))
                teacherDB.remove(teacher);
        }
    }

    public void deleteAllTeachers(){
        teacherDB.clear();
    }
    
}
