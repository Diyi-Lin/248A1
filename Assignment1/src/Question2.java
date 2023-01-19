

    // -------------------------------------------------------
	// Assignment1
	// Written by: (Diyi Lin student id40086388)
	// For COMP 248 Section  – Fall 2018
	// --------------------------------------------------------

import java.util.Scanner; //Java program to read data using Scanner class

   public class Question2 { 
		
		    public static void main(String[] args) 
		    { 
		     //write a program to calculate bmi
		   
		    //declare a scanner
		        Scanner bmi = new Scanner(System.in); 
		                                 //welcome banner//
		        System.out.println("************WELCOME TO BMI CALCULATOR************"); 
		        
		     //tell the user that it is time to enter his\her weight
		        System.out.println("Enter your weight in kilogram:"); 
		        
		     //double input (weight)
		        double a = bmi.nextDouble(); 
		        
		     //tell the user that it is time to enter his\her height
		        System.out.println("Enter your height in meter:"); 
		        
	         //double input (height)
		        double b = bmi.nextDouble(); 
		  
	                                       //be polite//
		        System.out.println("*******PLEASE WAIT********** "); 
		      
             //show his\her the data
		        System.out.println("YOUR WEIGHT IS "+ a + "KG"); 
		        System.out.println("YOUR HEIGHT IS "+ b + "M"); 
		       
		                              //don't be so serious//
		        System.out.println("SO");
		       
	         //convey weight and height into BMI
		        System.out.println("YOUR BMI IS "+ a/b/b);  //BMI=a/b^2,but ^ is undefined,so I divide it twice
	
	                                   //always gentleman//
		        System.out.println("******THANK YOU AND WISH YOU HEALTHY EVERDAY******");
		     
		      //close scanner
		        bmi.close();
		    } 
		} 