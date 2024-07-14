package com.sem4.pg1;

public class Overload {
    public void display(int a){
        System.out.printf("a");
    }
    public void display(int a, int b){
        System.out.printf(a + " , " + b);
    }
    public void display(String string){
        System.out.printf("string : " + string);
    }
}
