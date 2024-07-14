package com.sem4.pg1;

public class StudentSetter {
    private String name;
    private String dept;
    private int id;
    private double marks;

    public void setName(String name) {
        this.name = name;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }


    public void display(){
        System.out.println("name : " + name);
        System.out.println("dept : " + dept);
        System.out.println("id : " + id);
        System.out.println("marks : " + marks);
    }
}
