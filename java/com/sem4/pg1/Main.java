package com.sem4.pg1;

public class Main {
    public static void main(String[] args){

        /** Program 1 : Refer to class Cars*/
        Cars myCar = new Cars("Toyota", "Innova", "2016");
        myCar.display();

        System.out.println();

        /** Program 2 : Refer to class Movies*/
        Movies film = new Movies("Space Opera", "ESB", 8.7);
        Movies film2 = new Movies("Action", "Dune", 8.8);
        film.displayInfo();
        film2.displayInfo();

        System.out.println();

        /** Program 3 : Refer to class Student*/
        Student child = new Student();
        child.name = "Anakin";
        child.roll = 20;
        child.display();

        System.out.println();

        /** Program 4 : Refer to Class Overload*/
        Overload object = new Overload();
        object.display(20, 10);
        object.display("hello");
        object.display(10);

        System.out.println();


        /** Program 5 : Refer to class StudentConstructorOverload*/
        StudentConstructorOverload student = new StudentConstructorOverload();
        StudentConstructorOverload student2 = new StudentConstructorOverload("Ezra", "ECE", 002, 60);
        StudentConstructorOverload student3 = new StudentConstructorOverload(student2);
        student.display();
        student2.display();
        student3.display();

        System.out.println();

        /** Program 5 : Refer to class StudentSetter*/
        StudentSetter studentSet = new StudentSetter();
        studentSet.setName("Luke");
        studentSet.setDept("CSE");
        studentSet.setId(21);
        studentSet.setMarks(98);

        System.out.println();

        
    }
}
