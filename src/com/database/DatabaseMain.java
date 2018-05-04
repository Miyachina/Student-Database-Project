/**
 * 
 */
package com.database;

import java.util.Scanner;

/**
 * @author ACHINA
 *
 */
public class DatabaseMain {

	/**
	 * 
	 */
	public DatabaseMain() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		Database stu1 = new Database();
		stu1.enroll();	
		stu1.payTuition();
		System.out.println(stu1.showInfo());*/
		
		//Enter the number of students to be enrolled
		System.out.println("Enter the number of students to Enroll: ");
		Scanner in = new Scanner(System.in);
		int numStudents = in.nextInt();
		Database[] dbase = new Database[numStudents];
		
		//create new students to enroll
		
		for(int n = 0; n < numStudents; n++) {
			dbase[n] = new Database();
			dbase[n].enroll();
			dbase[n].payTuition();
		}
		
		for(int n = 0; n < numStudents; n++) {
			System.out.println(dbase[n].showInfo());
		}
	}

}
