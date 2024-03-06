package model;

public class Teacher extends Person{
    // attributes
    float salary;

    // constructor 1
    public Teacher(String name, int age, float salary){
        super(name,age);
        this.salary = salary;
    }

    // constructor 2 empty to get empty object
    public Teacher(){}

    // set & get
    public void setSalary(float salary){this.salary = salary;}
    public float getSalary(){return salary;}
}

