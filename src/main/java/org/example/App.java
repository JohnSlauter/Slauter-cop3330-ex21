package org.example;

import java.util.HashMap;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 John Slauter
 */

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {

        Scanner s = new Scanner(System.in);

        String output_text;

        int input;

        HashMap<Integer, String> month_map = initialize_map();

        System.out.print("Please enter the number of the month: ");

        input = s.nextInt();

        if(input < 1 || 12 < input){

            output_text = "Please enter a valid month number.";

        }

        else{

            output_text = "The name of the month is " + month_map.get(input) + ".";

        }

        System.out.print(output_text);

        s.close();

    }

    private static HashMap<Integer, String> initialize_map(){

        HashMap<Integer, String> map = new HashMap<Integer, String>(12);

        map.put(1, "January");

        map.put(2, "February");

        map.put(3, "March");

        map.put(4, "April");

        map.put(5, "May");

        map.put(6, "June");

        map.put(7, "July");

        map.put(8, "August");

        map.put(9, "September");

        map.put(10, "October");

        map.put(11, "November");

        map.put(12, "December");

        return map;

    }

}
