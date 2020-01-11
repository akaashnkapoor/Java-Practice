/*
    Program created by: Akaash Kapoor
    Date: January 10th, 2020
    Description: Applying concepts learned from school into a Grade Calculating program.
    Weights for the quizzes are 25% all together each marked out of 10. 
    Weight for the midterm is 50% marked out of 100.
    Weight for the final is 50% marked out of 100. 
    Room for Improvement: Create my own grade calcualtor so I could apply it to future courses. 
*/

package com.company;
import java.util.Scanner; //User input library

public class StudentRecord { 
    private double quizScore1; //Private instance variables means the variables can't be access from the main program (Encapsulation).
    private double quizScore2;
    private double midtermScore;
    private double finalScore;

    Scanner keyboard = new Scanner(System.in);//Creates a new object for user input. 

    public StudentRecord(){ //Default constructor
         quizScore1 = 0;
         quizScore2 = 0;
         midtermScore = 0;
         finalScore = 0;
    }

    public void readInput(){ //Method for reading inputs
        System.out.println("What was the Score on the first Quiz: ");
        quizScore1 = keyboard.nextDouble();
        System.out.println("What was the Score on the second Quiz: ");
        quizScore2 = keyboard.nextDouble();
        System.out.println("What was the score on the Midterm: ");
        midtermScore = keyboard.nextDouble();
        System.out.println("What was the score on the Final: ");
        finalScore = keyboard.nextDouble();
    }
    private double overallGrade(){ //Method for returning the final grade after all computations have been complete.
        return quizGrade(quizScore1, quizScore2) + midtermGrade(midtermScore)+ finalGrade(finalScore);
    }

    private double quizGrade(double quizScore1, double quizScore2){ //Calculates the weight of the quiz grade. 
        return ((quizScore1 + quizScore2) / 20.0) * 25;
    }

    private double midtermGrade(double midtermScore){ //Calculates the weight of the midterm grade.
        return (midtermScore/100.0) * 25;
    }

    private double finalGrade(double finalScore){//Calculates the weight of the final grade. 
        return (finalScore/100.0) * 50;
    }


   private char finalGrade() { //Returns the letter grade in terms of a letter. 
       double finalGrade = overallGrade();
       if (finalGrade < 60) {
           return 'F';
       } else if (finalGrade >= 60 && finalGrade < 70) {
           return 'D';
       } else if (finalGrade >= 70 && finalGrade < 80) {
           return 'C';
       } else if (finalGrade > -80 && finalGrade < 90) {
           return 'B';
       } else {
           return 'A';
       }

   }

    public void writeOutput (){ //outputs the student record. 
        System.out.println("Student Record");
        System.out.println("-------------------------------------");
        System.out.println("The quiz percentage weight was: " + quizGrade(quizScore1,quizScore2)+ " %");
        System.out.println("The midterm percentage weight was: " + midtermGrade(midtermScore) + " %");
        System.out.println("The final percentage weight was: " + finalGrade(finalScore) + " %");
        System.out.println("The total mark is: " + overallGrade() + " %");
        System.out.println("The letter grade assigned is: " + finalGrade());
    }
}
