package com.sem4.pg1;

public class Movies {
    String genre;
    String title;
    double IMDB;

    public Movies(String genre, String title, double IMDB) {
        this.genre = genre;
        this.title = title;
        this.IMDB = IMDB;
    }

    public void displayInfo(){
        System.out.println("title : " + title);
        System.out.println("genre : " + genre);
        System.out.println("IMDB : " + IMDB);
    }
}
