package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Esteban Leyte-Vidal
 */

public class App {
    public static void main ( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Press C to convert from Fahrenheit to Celsius. " + "\nPress F to convert from Celsius to Fahrenheit." + "\nYour choice: ");

        String input = scanner.next();
        if (input.equalsIgnoreCase("c"))
        {
            int temp, newTemp;

            System.out.print("Please enter the temperature in Celsius: ");
            temp = scanner.nextInt();
            newTemp = (temp - 32) * 5 / 9;
            System.out.println("The temperature in Celsius is " + newTemp);
        }

        else if (input.equalsIgnoreCase("f"))

        {
            int temp, newTemp;

            System.out.print("Please enter the temperature in Fahrenheit: ");
            temp = scanner.nextInt();
            newTemp = (temp * 9 / 5) + 32;
            System.out.println("The temperature in Fahrenheit is " + newTemp);
        }

        else
            System.out.println("Incorrect choice!");
    }
}
