package interfaces;

import model.School;
import services.SchoolServices;

public interface IFuntionsGui {

    School setSchoolWelcomeInfo();
    void printSchoolWelcomeInfo(School school);
    void whatDoYouWant();
    String iWantTo();
    void mainMenu(SchoolServices schoolServices);
    void checkResponse(String iwant, SchoolServices schoolServices);
    void addStudentGui(SchoolServices schoolServices);
    void removeStudentGui(SchoolServices schoolServices);
    void addTeacherGui(SchoolServices schoolServices);
    void removeTeacherGui(SchoolServices schoolServices);
    void printAllStudent(SchoolServices schoolServices);
    void printAllTeacher(SchoolServices schoolServices);

 
}
