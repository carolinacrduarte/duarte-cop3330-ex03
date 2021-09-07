/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Carolina Duarte
 */

import java.util.Scanner;

public class Exercise03 {

        public static void main(String[] args)
        {
            Scanner input = new Scanner(System.in);
            System.out.print("What is the quote? ");
            String quote = input.nextLine(); //Reads the quote string.
            System.out.print("Who said it? ");
            String author = input.nextLine(); //Reads the author string.
            System.out.println(author+ " says, \"" + quote + "\"");

        }
    }


        
        





