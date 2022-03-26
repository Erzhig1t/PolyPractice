package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Person[] persons = {new Dancer(),
                            new Programmer(),
                             new Singer()};
            System.out.println("Dancer");
            persons[0].eat();
            persons[0].walk();
        System.out.println("\nProgrammer");
        persons[1].eat();
        persons[1].walk();
        System.out.println("\nSinger");
        persons[2].eat();
        persons[2].walk();
//
        }
    }

