package com.techydinesh;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	float num1,num2;
        System.out.println("Enter First Number:");
        Scanner scan=new Scanner(System.in);
        num1=scan.nextFloat();

        System.out.println("Enter Second Number:");
        num2=scan.nextFloat();
        System.out.print("You have Entered ");
        System.out.print(num1);
        System.out.print(" and ");
        System.out.println(num2);
        String prompt = "Enter 0 for Addition ,1 for Subtraction,2 for Multiplication , 3 for Division and 4 for Remainder";
        System.out.println(prompt);
        int input=scan.nextInt();
        switch (input) {
            case 0 -> {
                System.out.println("The value of Adding these numbers is");
                System.out.println(num1 + num2);
            }
            case 1 -> {
                System.out.println("The value of Subtraction these numbers is");
                System.out.println(num1 - num2);
            }
            case 2 -> {
                System.out.println("The value of Multiplying these numbers is");
                System.out.println(num1*num2);
            }
            case 3 -> {
                System.out.println("The value of Dividing these numbers is");
                System.out.println(num1/num2);
            }
            case 4 -> {
                System.out.println("The value of Remainder by these numbers is");
                System.out.println(num1%num2);
            }
            default -> System.out.println("Invalid Inputs");
            /*
            This code is written by TechyDinesh.
             */
        }
    }
}
