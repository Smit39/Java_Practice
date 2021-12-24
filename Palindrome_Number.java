package com.mpstme;
import java.util.*;
public class Palindrome_Number
{  
   public static void main(String[] args) 
   {
       Scanner sc = new Scanner(System.in);  
       System.out.println("Enter the number: ");  
       String reverse = ""; 
       String num = sc.nextLine(); 
       int length = num.length();   
      for ( int i = length - 1; i >= 0; i-- )  
         reverse = reverse + num.charAt(i);  
      if (num.equals(reverse))  
         System.out.println(num +" is a palindrome.");  
      else  
         System.out.println(num +"  isn't a palindrome.");     
  }
} 