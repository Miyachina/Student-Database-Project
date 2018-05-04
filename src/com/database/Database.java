package com.database;

import java.util.Scanner;

public class Database {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String courses = "";
	private int tuitionBalance = 0;
	private String studentId;
	private String Level;
	private int countCourses = 0;
	//static means the value or property is not specific to the object but true for all objects in the class
	private static int costOfCourse = 600;
	private static int id = 1000;
	
	public Database() {
		//we create the constructor to prompt firstName,lastName and Grade
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Student's first name: ");
		this.firstName = in.nextLine();
		
		System.out.print("Enter Student's last name: ");
		this.lastName = in.nextLine();
		
		System.out.print("1 - FreshMan\n2 - Junior\n3 - Sophomore\n4 - Senior \nPlease Enter Student's Grade Year: ");
		this.gradeYear = in.nextInt();
		
		if(this.gradeYear == 1) {Level = "Freshman";}
		if(this.gradeYear == 2) {Level = "Junior";}
		if(this.gradeYear == 3) {Level = "Sophomore";}
		if(this.gradeYear == 4) {Level = "Senior";}
		
		setStudentID();
		
		System.out.println("Student Name: "+ this.firstName + " " + this.lastName + ", Level: " + Level + "\nS.ID: " + studentId);
		
	}
	
	//Generate ID that has the first digit as year grade
	private void setStudentID() {
		id++;
		this.studentId = gradeYear + "" + id;
		System.out.println(this.studentId);
	}
	//Enroll in courses, here the courses should also reflect the tuition fee of the enrolled student
	public void enroll() {
	do {
		System.out.print("Enter Courses to enroll (Q for Quit Enrollment): ");
		Scanner in = new Scanner(System.in);
		String course = in.nextLine();
		
		if(!course.equals("Q")){
		countCourses++;
		courses = courses + "\n " +course;
		tuitionBalance = tuitionBalance + costOfCourse;
		}else {System.out.println("You have decided to quit Enrolment");
		      break;}		
	}while (1 != 0); 
	int ccount = countCourses++;
		System.out.println("You have registered for " + ccount + " Courses: " + courses + "\nYour tuition balance is " + tuitionBalance);
	}
	
	public void viewBalance() {
		// we want the student to distinctly see her balance in this method
		System.out.println("This is your current Balance $" + tuitionBalance);
	}
	
	public void payTuition() {
		viewBalance();
		System.out.print("Enter your payment: $ ");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance = tuitionBalance - payment;
		viewBalance();
	}
	
	public String showInfo() {
		return "Name: " + firstName + " " + lastName + "\nS.ID: " + studentId + "\nLevel: " + Level + "\nCourses: " + courses + "\nYour Current Balance is $: " + tuitionBalance; 
	}
}
