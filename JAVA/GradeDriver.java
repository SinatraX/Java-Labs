/*
 * Add appropriate documentation here
 *
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;
/**
 * Add appropriate documentation here
 *
 */
public class GradeDriver{
/**
 * Add appropriate documentation here
 *
 */
	public static void main(String[] theArgs){

  	// Declare needed variables here


  	// The following should be good enough to open
  	// your files for I/O
  	// Use input for your input file and output for
  	// your output results file
  	Scanner input = null;
  	PrintStream output = null;
    try {
      input = new Scanner(new File("in4.txt"));
  		output = new PrintStream(new File("out4.txt"));
    }
    catch (FileNotFoundException e) {
      System.out.println("Error opening file: " + e);
  	}

	// Fill in the operations that create, manipulate, and output the
	// results of the TestGrades objects here
	// Use separate methods for reading in the data,
	// processing the data, and output


  } // End of main

	// write your methods here
  // Use appropriate javadoc including proper tags for each method.

}	// End of GradeDriver