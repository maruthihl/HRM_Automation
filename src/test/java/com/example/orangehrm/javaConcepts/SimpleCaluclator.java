package com.example.orangehrm.javaConcepts;

import java.util.Scanner;

public class SimpleCaluclator 
{
public static void main(String[] args)
 {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the First  number: ");
   int a=sc.nextInt();
    System.out.println("Enter the second   number: ");
    int b=sc.nextInt();
    System.out.println("Enter the operator (+, -, *, /): ");
    char operator = sc.next().charAt(0);
    switch (operator) {
        case '+':
            System.out.println("Addition: "+(a+b));
         

        case '-':
            System.out.println("Subtraction: "+(a-b));
          

        case '*':
            System.out.println("Multiplication: "+(a*b));
       

        case '/':
            System.out.println("Division: "+(a/b));
          
    
        default:
            
    }
    
}
    
}