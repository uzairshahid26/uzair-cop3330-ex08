/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Muhammad Uzair
 */


package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many people? ");
        int People = checkNumber(scanner.nextLine());

        System.out.print("How many pizzas do you have? ");
        int Pizza = checkNumber(scanner.nextLine());

        System.out.print("How many slices per pizza? ");
        int SlicesPerPizza = checkNumber(scanner.nextLine());

        int totalSlices = SlicesPerPizza * Pizza;
        int leftOvers = totalSlices % People;
        int eachPerson = totalSlices / People;
        if(People>SlicesPerPizza) {
            System.out.println("There isn't enough pizza for everybody! \n" +
                    "This is because there are " + People + " people and only " + totalSlices +
                    " slices.\n" + (People - SlicesPerPizza) + ((People-SlicesPerPizza)>1 ? " people": " person") + " will not have a slice." );
        }
        else if (leftOvers == 1) {
            System.out.println(People + " people with " + SlicesPerPizza + " pizzas. \n" +
                    "Each person gets " + eachPerson + " slices of Pizza.\n" +
                    "There is " + leftOvers + " leftover slice");
        } else {
            System.out.println(People + " people with " + Pizza + " pizzas " + "\"" + totalSlices + " slices.\"" + "\n" +
                    "Each person gets " + eachPerson + " slices.\n" +
                    "There are " + leftOvers + " leftover slices.");
        }
    }

    private static boolean isNum(String input) {
        boolean isNum = true;
        try {
            Integer.parseInt(input);
        }
        catch(NumberFormatException e) {
            isNum = false;
        }
        return isNum;
    }

    private static int checkNumber(String inputStr)
    {
        Scanner scanner = new Scanner(System.in);

        String inputToCheck = inputStr;
        int input = 0;
        boolean completed = false;
        while(!completed) {
            if (isNum(inputToCheck)) {
                input = Integer.parseInt(inputToCheck);
                completed = true;
            }
            else {
                System.out.println("Error! Please insert digits only: ");
                inputToCheck = scanner.nextLine();
            }
        }
        return input;
















    }
}
