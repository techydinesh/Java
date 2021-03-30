package com.techydinesh;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // This is for user input.
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter any number for days");
        int day= scan.nextInt();
        // This is switch statment.
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                    System.out.println("Tuesday");
                    break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
            default:
                        System.out.println("There are seven days in a week ,So This is not a valid number");
        }

    }
}
