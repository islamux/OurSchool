package model;

public class Student extends Person{
    // attributes
    String parentPhoneNumber;


    // constructor 1
    public Student(String name, int age, String parentPhoneNumber){
        super(name,age);
        this.parentPhoneNumber =parentPhoneNumber;

    }

    // constructor 2 empty to get empty object
    public Student(){}

    // set & get
    public void setParentPhoneNumber(String parentPhoneNumber){this.parentPhoneNumber = parentPhoneNumber;}
    public String getParentPhoneNumber(){return parentPhoneNumber;}

}
