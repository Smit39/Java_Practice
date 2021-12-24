package com.mpstme;
public class Largest_Element_Array {  
    public static void main(String[] args) {  
  
        int [] arr = new int [] {39, 111, 420, 69, 5};  
        int max = arr[0];  
        for (int i = 0; i < arr.length; i++) {  
           if(arr[i] > max)  
               max = arr[i];  
        }  
        System.out.println("Largest element present in given array: " + max);  
    }  
}  