package com.mpstme;
import java.util.Scanner;
public class Sunny_Number {

 public static void main(String[] args) {
  Scanner cs=new Scanner(System.in);
      int num;
      System.out.println("Enter a number:");
      num=cs.nextInt();
      double root;
      root=Math.sqrt(num+1);
     if((int)root==root)
       System.out.println("It is a Sunny Number.");
     else
          System.out.println("It is not a Sunny Number.");
   cs.close();
 }
}
