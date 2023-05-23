/*
* Course: TCSS142 – Introduction to Object-Oriented Programming
* File Name: Project1.java
* Assignment: 1
* DueDate: 4/20/21
* Instructor: Mr. Schuessler
*/

/**
* This program draws an image of the Space Needle...  
*
* @Jiaming Bai
* @jGRASP version: 2.0.6_07 
* Date: 2021/4/20 
*/

public class Project1 {

   final static int SIZE = 5; //This number can be changed as size 1,2,3,4.  
   
   public static void main(String[] args) {
      topoftheNeedle();
      halfoftheDome();
      thetube();
      halfDome();
      topoftheNeedle();
      mainframe();
      halfoftheDome();
      thetube();
   }
   
/*
*This prints out the needle part on the top.
*/
   public static void topoftheNeedle() {
      for (int i = 1; i <= SIZE; i++) {
         for (int space = 1; space <= SIZE*3; space++) {
            System.out.print(" ");
         }
         System.out.println("||");
      }
   }
   
/*
*This prints out the upper half of needle's dome.
*/
   public static void halfoftheDome(){
      for (int line = 1; line <= SIZE; line++) {
         for (int space = 1; space <= SIZE-line; space++) {
            System.out.print("   ");
         }  
         System.out.print("__/");
         for (int j = 1; j <= line-1; j++) {
            System.out.print(":::");
         }
         System.out.print("||");
         for (int j = 1; j <= line-1; j++) {
            System.out.print(":::");
         }
         System.out.println("\\__");
         }
   }
   
/*
*This prints horizontal line to the bottom.
*/
   public static void thetube() {
      System.out.print("|");
      for (int i = 1; i <= SIZE; i++) {
         System.out.print("\"\"\"\"\"\"");
      }
      System.out.println("|");
   }
   
/*
*This prints out the bottom half of needle's dome.
*/
   public static void halfDome(){
      for (int line = 1; line <= SIZE; line++) {
         for (int space = 1; space <= (line*2)-2; space++) {
            System.out.print(" ");
         }
         System.out.print("\\_");
         for (int j = 1; j <= (((SIZE*3)+1) - (line*2)); j++) {
            System.out.print("/\\");
         }
         System.out.println("_/");
      }
   }
   
/*
*This prints out the body part of the space needle.
*/
   public static void mainframe() {
      for (int line = 1; line <= SIZE * SIZE; line++) {
         for (int space = 1; space <= (SIZE*3)-3; space++) {
            System.out.print(" ");
         }
         System.out.println("|%%||%%|");
      }
   }
}
