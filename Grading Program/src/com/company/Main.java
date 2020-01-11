package com.company;

public class Main { //The main class runs the actual program by using methods from StudentRecords class. 

    public static void main(String[] args) {
        StudentRecord Student = new StudentRecord();//creation of the Student object. 
        Student.readInput();
        Student.writeOutput();
        
    }
}
