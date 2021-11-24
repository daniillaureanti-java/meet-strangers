package com.epam.rd.autotasks.meetstrangers;

import java.io.IOException;
import java.util.Scanner;

public class HelloStrangers {
    public static void main(String[] args) throws IOException {
        //Write a program, asks for a number - amount of strangers to meet.
        //Then reads stranger names line by line and prints line by line "Hello, ...".
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number > 0) {
            for (int i = 0; i<=number;i++){
                String string = sc.nextLine();
                System.out.println("Hello, "+string);
            }
        } else if (number == 0) {
            System.out.print("Oh, it looks like there is no one here");
        } else {
            System.out.print("Seriously? Why so negative?");
        }

    }
}
