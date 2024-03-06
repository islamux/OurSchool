package model;

public class Person {
    String name;
    int age;

    // constructor 1
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    // constructor 2 empty to get empty object
    public Person(){}

    // set & get
    public void setName(String name){
        this.name =name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

}
