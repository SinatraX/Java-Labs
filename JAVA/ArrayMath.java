/*
* Course: TCSS142 – Introduction to Object-Oriented Programming
* File Name: ArrayMath.java
* Assignment: ArrayMath
* DueDate: 5/25/21
* Instructor: Mr. Schuessler
*/
/**
* 2D Array
*
* @Jiaming Bai
* @jGRASP version: 2.0.6_07 
*/ 

public class ArrayMath {
      
    static int[][] multiplication(int[][] C,int[][] D,int m3,int n3,int m4,int n4)
   {
       int[][] result=new int[m3][n4];
       
       for (int i = 0; i < m3; i++)
   {
       for (int j = 0; j < n4; j++)
   {
         result[i][j] = 0;
         for (int k = 0; k < n3; k++)
         result[i][j] += C[i][k]*D[k][j];
      }
   }
         return result;
   }
  
  
  
      static int[][] add(int[][] A,int[][] B,int m1,int n1)
   {
       int[][] result=new int[m1][n1];
       for(int i=0;i<m1;i++)
       {
           for(int j=0;j<n1;j++)
               result[i][j]=A[i][j]+B[i][j];
       }
       return result;
   }

  
  
      static int[][] sub(int[][] A,int[][] B,int m1,int n1)
   {
       int[][] result=new int[m1][n1];
       for(int i=0;i<m1;i++)
       {
           for(int j=0;j<n1;j++)
               result[i][j]=A[i][j]-B[i][j];
       }
       return result;
   }
  
  
}