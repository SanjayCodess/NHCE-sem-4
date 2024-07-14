package com.sem4.pg1;

public class StudentConstructorOverload {
    String name;
    String dept;
    int id;
    double marks;

    public StudentConstructorOverload(){
        name = "Rey";
        dept = "CSE";
        id = 123;
        marks = 100;
    }

    public StudentConstructorOverload(String name, String dept, int id, double marks) {
        this.name = name;
        this.dept = dept;
        this.id = id;
        this.marks = marks;
    }

    public StudentConstructorOverload(StudentConstructorOverload myStudent){
        this.name = myStudent.name;
        this.dept = myStudent.dept;
        this.id = myStudent.id;
        this.marks = myStudent.marks;
    }

    public void display(){
        System.out.println("name : " + name);
        System.out.println("dept : " + dept);
        System.out.println("id : " + id);
        System.out.println("marks : " + marks);
    }

}
