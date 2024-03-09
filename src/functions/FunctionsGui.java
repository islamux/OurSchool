package functions;

import interfaces.IFuntionsGui;
import model.Student;
import model.Teacher;
import services.SchoolServices;

import java.util.Scanner;

public class FunctionsGui implements IFuntionsGui {
    private static final Scanner scanner = new Scanner(System.in);



    @Override
    public void whatDoYouWant() {
        System.out.println("What Do You want ? ");
    }

    @Override
    public String iWantTo() {
        return scanner.next();
    }

    @Override
    public void checkResponse(String iwant, SchoolServices schoolServices) {
        switch (iwant){
            case "adds":
                addStudentGui(schoolServices);
                break;
            case "removes":
                removeStudentGui(schoolServices);
            case "addt":
                addTeacherGui(schoolServices);
                break;
            case "removet":
                removeTeacherGui(schoolServices);
                break;
            case "alls":
                printAllStudent(schoolServices);
                break;
            case "allt":
                printAllTeacher(schoolServices);
                break;

        }
    }

    @Override
    public void addStudentGui(SchoolServices schoolServices) {
        Student student = new Student();
        // Name
        System.out.println("Plz enter the name: ");
        student.setName(scanner.next());
        // Age
        System.out.println("Plz enter the age: ");
        student.setAge(scanner.nextInt());
        // Phone
        System.out.println("Plz enter phone: ");
        student.setParentPhoneNumber(scanner.next());

        // add student to list of students
        schoolServices.addStudent(student);
    }

    @Override
    public void removeStudentGui(SchoolServices schoolServices) {
        Student student = new Student();
        // Name
        System.out.println("Plz enter the name: ");
        student.setName(scanner.next());
        // Age
        System.out.println("Plz enter the age: ");
        student.setAge(scanner.nextInt());
        // Phone
        System.out.println("Plz enter phone: ");
        student.setParentPhoneNumber(scanner.next());

        // add student to list of students
        schoolServices.removeStudent(student);
    }

    @Override
    public void addTeacherGui(SchoolServices schoolServices) {
        Teacher teacher = new Teacher();
        // Name
        System.out.println("Plz enter the name: ");
        teacher.setName(scanner.next());
        // Age
        System.out.println("Plz enter age: ");
        teacher.setAge(scanner.nextInt());
        // Salary
        System.out.println("Plz enter salary: ");
        teacher.setSalary(scanner.nextFloat());

        // add to list of teachers
        schoolServices.addTeacher(teacher);
    }

    @Override
    public void removeTeacherGui(SchoolServices schoolServices) {
        Teacher teacher = new Teacher();
        // Name
        System.out.println("Plz enter the name: ");
        teacher.setName(scanner.next());
        // Age
        System.out.println("Plz enter age: ");
        teacher.setAge(scanner.nextInt());
        // Salary
        System.out.println("Plz enter salary: ");
        teacher.setSalary(scanner.nextFloat());

        // add to list of teachers
        schoolServices.removeTeacher(teacher);
    }

    @Override
    public void printAllStudent(SchoolServices schoolServices) {
        for (Student student : schoolServices.getSchool().getStudents()){
            System.out.println(student.getName() + " " + student. getAge() + " " + student.getParentPhoneNumber());
        }
    }

    @Override
    public void printAllTeacher(SchoolServices schoolServices) {
        for (Teacher teacher : schoolServices.getSchool().getTeachers()){
            System.out.println(teacher.getName() + " " + teacher. getAge() + " " + teacher.getSalary());
        }
    }


}



