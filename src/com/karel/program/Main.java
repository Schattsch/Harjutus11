package com.karel.program;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(10);
        Box box2 = new Box(5);

        Book book = new Book("Fedor Dostojevski", "Crime and Punishment", 2);
        CD cd = new CD("Pink Floyd", "Dark Side of the Moon", 1973);

        box1.add(book);
        box1.add(cd);

        box2.add(box1);

        System.out.println(box1);
        System.out.println(box2);
    }
}