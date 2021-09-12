package org.example;
import java.util.Scanner;
/**
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Dynie Mesoneuvre
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.println("How many euros are you exchanging? ");
        double euro = input.nextDouble();
        System.out.println("What is the exchange rate?");
        double exchange = input.nextDouble();
        double rate = exchange/euro;
        System.out.println( euro + " euros at an exchange rate of " + exchange + " is \n" + rate + " U.S. dollars.");
    }
}
