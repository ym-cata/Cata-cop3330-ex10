/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Yesenia Cata
 */

import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    float price[] = new float[3];
    float quantity[] = new float[3];
    float subtotal = 0;
  Scanner sc = new Scanner(System.in);
      for(int i = 0; i < 3; i++){
      System.out.printf("Enter the price of item %d: ", (i+1)); //asks user to input price of 1st item
      price[i] = sc.nextInt();
            
      System.out.printf("Enter the quantity of items %d: ", (i+1)); //asks user to input quantity of items
      quantity[i] = sc.nextInt();
    }
                
      for(int i = 0; i < 3; i++){ //loops to ask user same question 3 times
      subtotal += price[i] * quantity[i];
        }
      System.out.println("Subtotal: $" + String.format("%.2f",subtotal)); //calculates subtotal
      System.out.println("Tax: $" + (subtotal * 0.055));//calculates taxes
      System.out.println("Total: $" + (subtotal + (subtotal * 0.055))); //calculates total including subtotal and taxes
     }
}