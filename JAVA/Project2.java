/*
* Course: TCSS142 – Introduction to Object-Oriented Programming
* File Name: Project2.java
* Assignment: 2
* DueDate: 5/4/21
* Instructor: Mr. Schuessler
*/
import java.util.Scanner;
/**
* Based on a user input value for the number of employees to process, this program will also prompt the 
* user for each employee’s hours worked, hourly pay rate, and name.  Once enter....  etc.
*
* @Jiaming Bai
* @jGRASP version: 2.0.6_07 
*/

//project2.java   

class project2
{

   public static int getEmployeeCnt(Scanner in)
    {
      System.out.print("How many employees are there? ");
      int num_emp = in.nextInt();
        
      return num_emp;

   }
   public static void processEmployeePay(Scanner in, int num_emp)
   {
      double top_hours = 0.0;
      
      String top_emp_name = "";

      for(int x = 0; x < num_emp; x++)
   {    
        System.out.print("Enter Hours Worked, Pay Rate, and Employee name separated by a space: ");

        double hours = in.nextDouble();
        double payrate = in.nextDouble();
        String name = in.nextLine();
       
        double grosspay = getGrossPay(hours, payrate);
        displayEmployeePay(name, hours, payrate, grosspay);
        if(hours > top_hours)

        {
         top_hours = hours;
         top_emp_name = name;

        }

      }

   displayTopEmployee(top_emp_name, top_hours);

   }
   public static double getGrossPay(double hours, double payrate)
   {

      double grosspay = 0.0;
      if(hours > 48)
      {
         grosspay += (40 * payrate) + (8 * 1.5 * payrate) + ((hours - 48) * 2 * payrate);

      }
      else if(hours > 40)
      {
         grosspay += (40 * payrate) + ((hours - 40) * 1.5 * payrate);

      }
      else if (hours <= 40)
      {
         grosspay += hours * payrate;

      }
      return grosspay;  

   }
   public static void displayEmployeePay(String name, double hours, double payrate, double grosspay)
   {
      System.out.println("Employee Name: " + name);
      System.out.println("Hours Worked: " + String.format("%.2f", hours));
      System.out.println("Pay Rate: " + String.format("%.2f", payrate));
      System.out.println("Gross Pay: $" + String.format("%,.2f", grosspay));
      System.out.println();
   }
   public static void displayTopEmployee(String emp_name, double hours)
   {
      System.out.println("\nWOW!!!! What a Dynamo! " + emp_name + " Worked " + hours + " Hours this WEEK!");
   }
   
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      int num_emp = getEmployeeCnt(in);
      processEmployeePay(in, num_emp);
   }

}