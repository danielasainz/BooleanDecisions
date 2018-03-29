package com.company;

import java.util.Scanner;

public class Main {

   public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);
      System.out.print("Enter your test score: ");
      int score = scan.nextInt();
      System.out.println("Your score was: " + score);
      char grade;

      if (score > 89) {
         grade = 'A';
         System.out.println("Your grade was: " + grade);
      } else if (score > 79) {
         grade = 'B';
         System.out.println("Your grade was: " + grade);
      } else if (score > 69) {
         grade = 'C';
         System.out.println("Your grade was: " + grade);
      } else if (score > 60) {
         grade = 'D';
         System.out.println("Your grade was: " + grade);
      } else if (score > 50) {
         grade = 'F';
         System.out.println("Your grade was: " + grade);

      } if (score > 69) {
         System.out.println("Very good! You don't have to retake the exam!");
      }  else {
            System.out.println("Did you even look at the book?");
      }
   }
}
