package com.example.orangehrm.javaConcepts;

public class Recursion 
{
    public static void printNumber(int number)
    {
        if(number==0)
        {
            return;
        }
         System.out.println(number);
        printNumber(number-1);
       
    }
    public static void main(String[] args) {
        printNumber(5);
    }
}
