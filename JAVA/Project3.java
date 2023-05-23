/*
* Course: TCSS142 – Introduction to Object-Oriented Programming
* File Name: Project3.java
* Assignment: 3
* DueDate: 5/25/21
* Instructor: Mr. Schuessler
*/
import java.util.*;
/**
* This program will perform a basic addition, subtraction, and multiplication of two matrices.
*
* @Jiaming Bai
* @jGRASP version: 2.0.6_07 
*/

//Project3.java

public class Project3 {

   public static void main(String[] args) {
       
       System.out.println("Enter the size of Array A");
       Scanner in=new Scanner(System.in);
       int m1=in.nextInt();
       int n1=in.nextInt();
       int [][]A;
       A=new int[m1][n1];
       System.out.println("Enter the value of Array A");
      
       for(int i=0;i<m1;i++)
       {
           for(int j=0;j<n1;j++)
           {
               A[i][j]=in.nextInt();
           }
       }
      
      
      
       System.out.println("Enter the size of Array B");
       int m2=in.nextInt();
       int n2=in.nextInt();
       int [][]B;
       B=new int[m2][n2];
       System.out.println("Enter the value of Array B");
      
       for(int i=0;i<m2;i++)
       {
           for(int j=0;j<n2;j++)
           {
               B[i][j]=in.nextInt();
           }
       }
      
      
       System.out.println("Enter the size of Array C");
       int m3=in.nextInt();
       int n3=in.nextInt();
       int [][]C;
       C=new int[m3][n3];
       System.out.println("Enter the value of Array C");
      
       for(int i=0;i<m3;i++)
       {
           for(int j=0;j<n3;j++)
           {
               C[i][j]=in.nextInt();
           }
       }
      
      
      
       System.out.println("Enter the size of Array D");
       int m4=in.nextInt();
       int n4=in.nextInt();
       int [][]D;
       D=new int[m4][n4];
       System.out.println("Enter the value of Array D");
      
       for(int i=0;i<m4;i++)
       {
           for(int j=0;j<n4;j++)
           {
               D[i][j]=in.nextInt();
           }
       }
      
       int[][] sum;
       sum=new int[m1][n1];
       sum=ArrayMath.add(A,B,m1,n1);
       System.out.println("MATRIX A PLUS MATRIX B:");
      
       for(int i=0;i<m1;i++)
       {
           for(int j=0;j<n1;j++)
           {
           System.out.print(" "+sum[i][j]);
           }
           System.out.println();
       }
      
      
       int[][] diff;
       diff=new int[m1][n1];
       diff=ArrayMath.sub(A,B,m1,n1);
       System.out.println("MATRIX A MINUS MATRIX B:");
      
       for(int i=0;i<m1;i++)
       {
           for(int j=0;j<n1;j++)
           {
           System.out.print(" "+diff[i][j]);
           }
           System.out.println();
       }
      
      
       int[][] mult;
       mult=new int[m3][n4];
       mult=ArrayMath.multiplication(C,D,m3,n3,m4,n4);
       System.out.println("MATRIX C TIMES MATRIX D:");
      
       for(int i=0;i<m3;i++)
       {
           for(int j=0;j<n4;j++)
           {
           System.out.print(" "+mult[i][j]);
           }
           System.out.println();
       }
      
   }

}