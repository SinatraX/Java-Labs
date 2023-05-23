/*
* Course: TCSS142 – Introduction to Object-Oriented Programming 
* Instructor: David Schuessler
* File Name: TestGrades.java
*/

/**
*This java class keeps student's names and grades.
*
* @author Jiaming Bai
* @version 1 June 2021
*/

public class TestGrades {
   //constants
   /** A default value. */
   private String firstName;
   private String lastName;
   private int scores[];
   private static int count = 0;
   
   /**
   * This is the method of total class count.
   *
   * @param theArgs is used for command line input.
   */
  
   // Initialize the name and scores array.
   public TestGrades(String firstName, String lastName, int scores[])
   {
       count++;
       this.firstName = firstName;
       this.lastName = lastName;
       this.scores = new int[scores.length];
       for(int i=0;i<scores.length;i++)
           this.scores[i] = scores[i];
   }
  
   // Return method to the numbers in Project4 file TestGrades objects.
   public int getStudentCount()
   {
       return count;
   }
  
   // Return method to the student's first name.
   public String getFirstName()
   {
       return firstName;
   }
  
   // Return method to the student's last name.
   public String getLastName()
   {
       return lastName;
   }
  
   // This method is to set the score of the given index in the scores array.
   public void setScore(int index, int score)
   {
       // Validate index and score.
       if(index >0 && index < 5 && score >= 0&& score <=100)
       {
           // The 'if' valid set the score of index.
           scores[index-1] = score;
       }
   }
  
   // Return method to the average of three highest test scores.
   public int getTestsAverage()
   {
       int total, min;
      
       total = scores[0];
       min = scores[0];
       // Loop for the total score and minimum score.
       for(int i=1;i<scores.length;i++)
       {
           total += scores[i];
           if(scores[i] < min)
               min = scores[i];
       }
      
       total -= min; // Remove the minimum score from the total.
      
       // Return the average of three highest test scores.
       return total/3;
   }
  
   // This method return the string representation of the TestGrades object.
   public String toString()
   {
       String str= firstName+" "+lastName+" [";
       for(int i=0;i<scores.length-1;i++)
           str += scores[i]+", ";
       str += scores[scores.length-1]+"] "+"Average = "+getTestsAverage();
      
       return str;
       
       /**
       * Displays the results (class average and number of students).
       *
       * @param getStudentCount is the array of test scores.
       * @param getTestsAverage contains the average of all scores.
       */
       
       
   }  // End of main.
   

}  //End of TestGrades.java
