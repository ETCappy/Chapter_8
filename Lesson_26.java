/*
* Lesson 26 - Unit 3 - Algorithms on Arrays
*/
import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;
import java.lang.Math;


public class Lesson_26{
  
     public static void main (String str[]) throws IOException {
    	  Scanner scan = new Scanner(System.in);
          int tests [] = new int[20];   
          
          //initialize to true
          for (int i = 0; i < tests.length; i++)
          {
               tests[i] = (int)(Math.random()*55)+45;
          }
          //print the array
          for (int i = 0; i < tests.length-1; i++)
          {
               System.out.print(tests[i] + " "  );
          }
          
          System.out.println("\n\nWhere should it be inserted?");
          int where = scan.nextInt();
          System.out.println("What should it be inserted?");
          int what = scan.nextInt();
          
        
     
     for (int i = tests.length-1;i >where; i--) {
         
       	tests[i] = tests[i-1];
       }
     tests[where]=what;
     
     for (int i = 0; i < tests.length - 1; i++) {
    	    System.out.print(tests[i] + " " );

}
     }
}
