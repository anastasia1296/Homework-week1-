package oop.week1;

/**
 * Created by Anastasya on 14.05.2017.
 */
public class Student {

    String name;
    String surName;
    int age;

    public Student(){
    }

    public Student(String name, String surName, int age){
        this.name = name;
        this.surName = surName;
        this.age = age;
    }

    public String asString(){
        return String.format("Student name - %s, surName - %s, age - %d",
                name, surName, age);
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surName = surname;
    }



}

