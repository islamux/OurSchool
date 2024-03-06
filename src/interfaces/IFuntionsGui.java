package interfaces;

import services.SchoolServices;

public interface IFuntionsGui {

    void whatDoYouWant();
    String iWantTo();
    void checkResponse(String iwant, SchoolServices schoolServices);
    void addStudentGui(SchoolServices schoolServices);
    void removeStudentGui(SchoolServices schoolServices);
    void addTeacherGui(SchoolServices schoolServices);
    void removeTeacherGui(SchoolServices schoolServices);
    void printAllStudent(SchoolServices schoolServices);
    void printAllTeacher(SchoolServices schoolServices);
}
