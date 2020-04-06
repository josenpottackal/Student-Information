
/**
* File Name: StudentInfo.java
* Purpose: Implementation of student exam information
* Date: 2020-01-15
* Last modified: 2020-01-15
* Author: Josen Pottackal
* Copy right no copyright
* Version: 1.0
*/

import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class studentInformation {  
	public static void main(String[] args) {  
		  try {
			  File studentInfo = new File("studentInfo.txt");
			  Scanner in = new Scanner(studentInfo);
			      
			  File outputFile = new File ("studentExamInfo.txt");
			  PrintWriter out = null;
			  out = new PrintWriter (outputFile);
		      
			  while (in.hasNextLine()) {
				  int studentID = in.nextInt();
		    	  String firstName = in.next();
		          String surname = in.next();
		          double courseworkOne = in.nextDouble();
		          double courseworkTwo = in.nextDouble();
		          double examMark  = in.nextDouble();
		          
		          double totalResult = Math.round((courseworkOne * 0.1) + 
		        		  					(courseworkTwo * 0.1) + (examMark * 0.8));
		         
		          out.println (studentID + "," + " " + surname + 
		        		  			" " + firstName + ":" + " "+ totalResult);
		          
		          System.out.println(String.format("%-20s %-20s %20s: %20s" ,studentID, firstName, surname, examMark));
		      }
		      in.close();
		      out.close ();
		      
		    } catch (FileNotFoundException e) {
		        System.out.println("File Not Found");
		        e.printStackTrace();
		    } 
 		}  
	}   
