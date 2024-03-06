package services;

import model.School;
import model.Student;
import model.Teacher;

public class SchoolServices {
    // attributes
    School school;

    //constructor 1
    public SchoolServices(School school){
        this.school =school;
    }

    // Set and get --> only want getSchool

    public School getSchool() {
        return school;
       }

       // Services
    // addStudent
    public void addStudent(Student student){
        this.school.getStudents().add(student);
    }
    // removeStudent
    public void removeStudent(Student student){this.school.getStudents().remove(student);}
    // addTeacher
    public void addTeacher(Teacher teacher){
        this.school.getTeachers().add(teacher);
    }
    public void removeTeacher(Teacher teacher){
        this.school.getTeachers().remove(teacher);
    }
    // searchStudent
    public Student findStudentByName(String name){
        for(Student student : this.school.getStudents()){
            if (student.getName().equals(name)) {
                return student;
            }
        }
        return null;
    }
    // searchTeacher
    public Teacher findTeacherByName(String name){
        for (Teacher teacher : this.school.getTeachers()){
            if (teacher.getName().equals(name)) {
                return teacher;
            }
        }
        return null;
    }
}
