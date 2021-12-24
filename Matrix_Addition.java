package com.mpstme;
public class Matrix_Addition{  
public static void main(String args[]){  
int a[][]={{1,5,8},{1,1,1},{6,6,6}};    
int b[][]={{9,1,4},{2,2,2},{9,9,9}};    
int c[][]=new int[3][3];  
for(int i=0;i<3;i++){    
for(int j=0;j<3;j++){    
c[i][j]=a[i][j]+b[i][j];    
System.out.print(c[i][j]+" ");    
}    
System.out.println(); 
}    
}}  