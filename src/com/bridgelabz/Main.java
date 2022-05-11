package com.bridgelabz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");

        int num = input.nextInt();

        switch (num){
            case 1:
                System.out.println("One");
            break;
            case 2:
                System.out.println("Two");
                break;
            default:
                System.out.println("Invalid input.");
        }
    }
}
