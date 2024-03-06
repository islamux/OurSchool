package model;

import java.util.ArrayList;

public class Grade {
    // attributes
    String name;
    String code;
    // one teacher for grade
    Teacher teacher;
    // List of students
    ArrayList<Student> students;

    // constructor 1
    public Grade(String name, String code){
        this.name =name;
        this.code = code;
    }

    // constructor 2 empty to get object
    public Grade(){}

    // set & get
    public void setName(String name){this.name =name;}
    public String getName(){return name;}

    public void setCode(String code){this.code = code;}
    public String getCode(){return code;}

    // one teacher for grade
    public void setTeacher(Teacher teacher){this.teacher = teacher;}
    public Teacher getTeacher(){return teacher;}

    // list of students
    public void setStudents(ArrayList<Student>students){this.students = students;}
    public ArrayList<Student>getStudents(){return students;}


}
