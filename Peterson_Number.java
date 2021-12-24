package com.mpstme;
import java.util.Scanner;
public class Peterson_Number {
	private static Scanner sc;
	
	public static void main(String[] args) {
		int fact, rem, sum = 0;
		sc = new Scanner(System.in);	
		
		System.out.print("Enter Number: ");
		int pnum = sc.nextInt();
		
		for(int temp = pnum; temp > 0; temp = temp/10)
		{
			fact = 1;
			rem = temp % 10;
			
			for(int i = 1; i <= rem; i++) 
			{
				fact = fact * i;
			}
			sum = sum + fact;
		}

		if (sum == pnum) 
		{
			System.out.println(pnum +  " is a Peterson Number");
		}
		else 
		{
			System.out.println(pnum +  " is Not a Peterson Number");
		}
	}

}