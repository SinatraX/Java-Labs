import java.util.Random;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
      int val = 1;
      int count = 0;
      boolean done = false;
      Random r = new Random ();
      while(!done){
         int num = r.nextInt(3) + 2;
         System.out.println(num);
            if (num - 1 == val) {
               count++;
               val = num;
               }
               else{
                  count = 0;
                  val = 1;
                  }
                  done = count == 3;
      }
   }
}  
                 