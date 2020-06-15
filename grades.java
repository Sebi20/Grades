package Grades;

import java.util.Scanner;
import java.io.*;

public class grades{
	public static void main(String[] args) throws IOException{
		Scanner input = new Scanner(System.in);
		PrintWriter output = new PrintWriter("/Users/sebiseb/eclipse-workspace/Practice/src/Grades/grades.txt");
		
		int id; // ID number
		int cnt = 0; // counter
		double avg; // Average
		
		
		String name;// Student first name
		String name2;// Student last name
		
		// Classes
		double eng;
		double mat;
		double sci;
		double phy;
		double his;
		
		output.println("Student grade report log: ");
		output.println("===============================\n");
		
		System.out.print("Type the student's ID number: ");
		id = input.nextInt(); // Collects the ID number
		
		while(id != -1 ) { // Sentinel value
			System.out.print("Student first name: ");
			name = input.next();// Collects student name
			
			System.out.print("Student last name: ");
			name2 = input.next();// Collects student name
			
			System.out.print("English grade: ");
			eng = input.nextDouble(); // Collects English grade
			
			System.out.print("Math grade: ");
			mat = input.nextDouble(); // Collects Math grade
			
			System.out.print("Science grade: ");
			sci = input.nextDouble(); // Collects Science grade
			
			System.out.print("Physical Education grade: ");
			phy = input.nextDouble(); // Collects PE grade
			
			System.out.print("History grade: ");
			his = input.nextDouble(); // Collects Social Studies grade
			System.out.println("");
			
			cnt++;// Counts the amount of Students processed
			
			avg = gradeAvg(eng, mat, sci, phy, his);// Gets the average of the student
			
			// Prints out the grades
			output.println("Student name: " + name + " " + name2);
			output.println("Student ID: " + id);
			output.println("English: " + eng);
			output.println("Math: " + mat);
			output.println("Science: " + sci);
			output.println("Physical Education: " + phy);
			output.println("History: " + his);
			output.println("The average is: " + avg + "(" + letterGrade(avg) + ")");
			output.println("-------------------------------\n");
			
			System.out.print("Type another ID or -1 to stop: ");// Sentinel
			id = input.nextInt(); //Allows the code to keep going until -1 is typed
			
		}
		
		System.out.println("Program is done");// Prints the final message
		
		
		
		output.println("the number of students processed: " + cnt);
		
		
		output.close();
		
	}// END OF THE MAIN METHOD
	
	public static double gradeAvg (double eng, double mat, double sci, double phy, double his) { // Method for calculating the average score 
		double avg = (eng + mat + sci + phy + his)/5;
		return avg;
	}// END OF THE GRADEAVG METHOD
	
	public static String letterGrade(double num) { // Method for determining the letter grade
		String let; 
		
		// Checks the grade
		if (num >= 97.0) {
			let = "A+";
		} else if (num <= 96 && num >= 93) {
			let = "A";
		} else if (num <= 92 && num >=90) {
			let = "A-";
		} else if (num <= 89 && num >= 87) {
			let = "B+";
		} else if(num <= 86 && num >= 83) {
			let = "B";
		} else if (num <= 82 && num >= 80) {
			let = "B-";
		} else if (num <= 79 && num >= 77) {
			let = "C+";
		} else if (num <= 76 && num >= 73) {
			let = "C";
		} else if (num <= 72 && num >= 70) {
			let = "C-";
		} else if (num <= 69 && num >= 67) {
			let = "D+";
		} else if (num <= 66 && num >= 65) {
			let = "D";
		} else {
			let = "F";
		}
		return let;
		
	}// END OF THE LETTERGRADE METHOD
	
}