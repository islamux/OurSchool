package gui;

import services.SchoolServices;
import model.School;
import model.Student;

import java.util.Scanner;

public class GuiOld {
    static Scanner scanner = new Scanner(System.in);


    public static void start(){
         School school = GuiOld.createSchool();
         SchoolServices schoolServices = new SchoolServices(school);

        System.out.println("Welcome to " + school.getName() + "\n" + school.getAddress() + "\n" + school.getPhone());
        String action;

        do {
                System.out.println("what do you want?");
                action = scanner.next();

                if (action.equals("adds")){
                    Student student = new Student();
                    System.out.println("enter name");
                    student.setName(scanner.next());

                    schoolServices.addStudent(student);
                }
                if (action.equals("alls")){
                    for (Student student :school.getStudents()){
                        System.out.println(student.getName());
                    }
            }

        }while (! action.equals("exit"));
    }


    // Functions
    private static School createSchool(){
        School school  = new School();
        school.setName("SDF");
        school.setPhone("240929");
        school.setAddress("Gamal Street");
        return school;
    }

}

