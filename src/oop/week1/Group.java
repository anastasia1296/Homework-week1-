package oop.week1;

import java.lang.reflect.Array;

/**
 * Created by Anastasya on 14.05.2017.
 */
public class Group {
    private int groupNumber;
    private Student[] students;
    public int groupSize = 0;
    public int size;


    public Group(Student[] students, int groupNumber) {
        this.groupNumber = groupNumber;
        this.students = students;
        groupSize = students.length;
         size = countStudents(students);


//to cut group size later

    }

    private int countStudents(Student[] students) {
        int count=0;
        for (:
             )




    public Group(int groupNumber, int groupSize) {
        this.groupNumber = groupNumber;
        this.students = new Student[groupSize];

    }

    public boolean addStudent(Student students) {
        if (students == null)//(size==students)) {
                return false;
            }else{

        return String.format() ;}
    }

    public boolean removeStudent(Student student) {
        return false;
    }

    public boolean updateStudent(Student student) {
        return false;
    }

    public String asString() {
        String info = "[";
        for (int i = 0; i < students.length; i++) {
            info += students[i].asString();
            info += ", \n";
        }
        info += students[students.length - 1].asString() + "]";
        return String.format("group number - %d, \n students: %s", groupNumber, "\n" + info);

    }

}