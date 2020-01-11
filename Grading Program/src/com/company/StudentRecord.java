package com.company;
import java.util.Scanner;

public class StudentRecord {
    private double quizScore1;
    private double quizScore2;
    private double midtermScore;
    private double finalScore;

    Scanner keyboard = new Scanner(System.in);

    public StudentRecord(){ //Default constructor
         quizScore1 = 0;
         quizScore2 = 0;
         midtermScore = 0;
         finalScore = 0;
    }

    public void readInput(){
        System.out.println("What was the Score on the first Quiz: ");
        quizScore1 = keyboard.nextDouble();
        System.out.println("What was the Score on the second Quiz: ");
        quizScore2 = keyboard.nextDouble();
        System.out.println("What was the score on the Midterm: ");
        midtermScore = keyboard.nextDouble();
        System.out.println("What was the score on the Final: ");
        finalScore = keyboard.nextDouble();
    }
    private double overallGrade(){
        return quizGrade(quizScore1, quizScore2) + midtermGrade(midtermScore)+ finalGrade(finalScore);
    }

    private double quizGrade(double quizScore1, double quizScore2){
        return ((quizScore1 + quizScore2) / 20.0) * 25;
    }

    private double midtermGrade(double midtermScore){
        return (midtermScore/100.0) * 25;
    }

    private double finalGrade(double finalScore){
        return (finalScore/100.0) * 50;
    }


   private char finalGrade() {
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

    public void writeOutput (){
        System.out.println("Student Record");
        System.out.println("-------------------------------------");
        System.out.println("The quiz percentage weight was: " + quizGrade(quizScore1,quizScore2)+ " %");
        System.out.println("The midterm percentage weight was: " + midtermGrade(midtermScore) + " %");
        System.out.println("The final percentage weight was: " + finalGrade(finalScore) + " %");
        System.out.println("The total mark is: " + overallGrade() + " %");
        System.out.println("The letter grade assigned is: " + finalGrade());
    }
}
