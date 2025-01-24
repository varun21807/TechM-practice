package com.assignment3.app;

import java.util.Scanner;

public class Booking {
	 
		Scanner scanner=new Scanner(System.in);

		public static void main(String[] args) {
	     login();
	     Booking m=new Booking();
	     Movie m1=new Movie();
	     m1.movieDetials();
	      	  
		}
	private static void login() {
	    String [] user_Name= {"Vijay","Ajith","Rajini","Vishal","Surya"};
	    String [] user_pass= {"Anil4","Aamai3","Kalugu1","Anaconda5","Kanga2"};
	    Scanner scanner=new Scanner(System.in);
	    System.out.println("Enter the Username:");
	    String username=scanner.nextLine();
	    System.out.println("Enter the Password:");
	    String userpass=scanner.nextLine();
	    Booking m=new Booking();
	    User u=new User();
	    boolean login_valdate=u.validation(user_Name, user_pass, username, userpass);
	    if(login_valdate) {
	    	 System.out.println("Succesful login!!");
	    }
	    else {
	  	    System.out.println("unsuccesful login enter the correct credentials");
	  	    login();
	    }
	    
	}

}
