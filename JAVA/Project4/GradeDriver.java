/*
* Course: TCSS142 – Introduction to Object-Oriented Programming
* Instructor: David Schuessler
* File Name: GradeDriver.java
*/

import java.util.*;
import java.io.*;
import java.io.File.*;
import java.io.FileNotFoundException.*;
import java.io.PrintStream.*;
import java.util.Scanner.*;

/**
*This java program runs to read student details from file in4.txt and create the TestGrades object and output the result to file.
*
* @author Jiaming Bai
* @version 1 June 2021
*/

public class GradeDriver{
  
   // This method is to read details from the in4.txt file and return the array of the TestGrades.
   public static TestGrades[] readFile(Scanner file)
   {
       String firstName, lastName;
       int scores[] = new int[4];
       int numStudents = 0;
       numStudents = file.nextInt(); 
       // Read the number of students from the in4.txt file.
       
       // Create the read number of students object from in4.txt file.
       TestGrades grades[] = new TestGrades[numStudents];
       int count = 0;
       // A loop to read till the end of the in4.txt file and to creating the TestGrades object for each student.
       while((file.hasNext()) && (count < numStudents))
       {
           firstName = file.next();
           lastName = file.next();
          
           for(int i=0;i<scores.length;i++)
           {
               scores[i] = file.nextInt();
           }
          
          
           grades[count] = new TestGrades(firstName,lastName,scores);
           count++;
       }
      
       return grades;
   }
  
   // This method is to output the students details, maximum , minimum and class average to output file.
   public static void writeFile(PrintStream writer, TestGrades grades[])
   {
       int classAvg =0 , minAvg = grades[0].getTestsAverage(), maxAvg = minAvg; // 3 sections of for loop header:
       writer.print("Total number of students: "+grades[0].getStudentCount()+"\n\n"); //   1. Initialize
       for(int i=0;i<grades.length;i++)
       {
           writer.print(grades[i].toString()+"\n");
           classAvg += grades[i].getTestsAverage();
          
           if(grades[i].getTestsAverage() > maxAvg)
               maxAvg = grades[i].getTestsAverage();
          
           if(grades[i].getTestsAverage() < minAvg)
               minAvg = grades[i].getTestsAverage(); //   2. Test condition
       }
      
       classAvg = classAvg/grades[0].getStudentCount(); //   3. Increment
      
       writer.print("\nHighest Student Average = "+maxAvg);
       writer.print("\nLowest Student Average = "+minAvg);
       writer.print("\nOverall class Average = "+classAvg);
   }

   public static void main(String[] args) {

      
       Scanner input = null;
       PrintStream output = null;
       try {
       input = new Scanner(new File("in4.txt")); // Open the input in4.txt file.
       output = new PrintStream(new File("out4.txt")); // Open the output out4.txt file.
      
       TestGrades grades[] = readFile(input); // Read from file to array.
       writeFile(output,grades); // Write from array to output file.
      
       // Close both input and output files.
       input.close();
       output.close();
      
       }
       catch (FileNotFoundException e) {
       System.out.println("Error opening file: " + e); // Display the results to the console.
       }
       
       
   }  // End of main.


}	// End of GradeDriver.java