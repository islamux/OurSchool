package model;
import java.util.ArrayList;

public class School {

    // attributes
    String name;
    String address;
    String phone;
    ArrayList<Student> students;
    ArrayList<Teacher> teachers;
    ArrayList<Grade> grades;

    // constructor 1
    public School(String name)
    {
        this.name = name;
        this.initObjectFromArrays();
    }

    // constructor 2 empty to get empty object
    public School(){
        this.initObjectFromArrays();
    }

    // set & get
    // Name
    public void setName(String name) {this.name = name;}
    public String getName(){return name;}

    // Address
    public void setAddress(String address){this.address = address;}
    public String getAddress(){return  address;}

    // Phone
    public void setPhone(String phone){this.phone = phone;}
    public String getPhone(){return  phone;}

    // Students List
    public ArrayList<Student> getStudents(){return students;}

    // Teachers List
    public ArrayList<Teacher>getTeachers(){return teachers;}

    // grades List
    public ArrayList<Grade>getGrades(){return grades;}


    // initObject for Students Array , Teachers Array, Grades Array to make it run when School class is run
    private void initObjectFromArrays(){
        this.students = new ArrayList<Student>();
        this.teachers = new ArrayList<Teacher>();
        this.grades = new ArrayList<Grade>();
    }
}
