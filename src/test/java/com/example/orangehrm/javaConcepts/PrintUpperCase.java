package com.example.orangehrm.javaConcepts;

public class PrintUpperCase 
{
    public static void main(String[] args) {
        char ch=65;
        while (ch<=90) 
        {
            System.out.print(ch);
            if(ch!=90)
            {
                System.out.print("-");
            }
            ch++;
        }
    }
    
}
