package com.javafundamentals1.app;

import java.util.Scanner;

public class MovieTicketBooking {
 
	Scanner scanner=new Scanner(System.in);

	public static void main(String[] args) {
     login();
     MovieTicketBooking m=new MovieTicketBooking();
     m.movieDetials();
      	  
	}
private static void login() {
    String [] user_Name= {"Vijay","Ajith","Rajini","Vishal","Surya"};
    String [] user_pass= {"Anil4","Aamai3","Kalugu1","Anaconda5","Kanga2"};
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter the Username:");
    String username=scanner.nextLine();
    System.out.println("Enter the Password:");
    String userpass=scanner.nextLine();
    MovieTicketBooking m=new MovieTicketBooking();
    boolean login_valdate=m.validation(user_Name, user_pass, username, userpass);
    if(login_valdate) {
    	 System.out.println("Succesful login!!");
    }
    else {
  	    System.out.println("unsuccesful login enter the correct credentials");
  	    login();
    }
    
}

private boolean validation(String [] user_Name,String [] User_pass,String username,String userpass) {

      for(int i=0;i<user_Name.length;i++) {
    	  if(username.equals(user_Name[i]) && userpass.equals(User_pass[i])) {
    		  return true;
    	  }
      }
      return false;
}

public void movieDetials(){
	String[] movies={"1. Velu - 2:00 PM",
			"2. Virumandi - 5:00 PM",
			"3. Thalapthy - 8:00 PM"};
	for(int i=0;i<movies.length;i++) {
	System.out.println(movies[i]);
}
	System.out.println("Enter a number to select the movie:");
	int movieNum=scanner.nextInt();
	if(movieNum>3) {
		System.out.println("You have entered a invalid movie please \nSelect a valid movie");
		movieDetials();
	}
	System.out.println("The movie you have selected:"+movies[movieNum-1]);
	seatSelection(movieNum);
}
public void seatSelection(int movieNum) {
	boolean [][] velu = {{true,false,true,true,true}
                        ,{true,false,true,true,true}
                        ,{true,true,true,true,true}
                        ,{true,false,true,true,true}};
	
	boolean [][] Virumand = {{true,false,true,true,true}
                             ,{true,false,true,true,true}
                           ,{true,true,true,true,true}
                             ,{true,false,true,true,true}};
	
	boolean [][] Thalapathy = {{true,false,true,true,true}
                              ,{true,false,true,true,true}
                              ,{true,true,true,true,true}
                              ,{true,false,true,true,true}};
	
	String [][] seats= {{"A1","A2","A3","A4","A5"}
			             ,{"B1","B2","B3","B4","B5"}
			             ,{"C1","C2","C3","C4","C5"}
			             ,{"D1","D2","D3","D4","D5"}};
	for(int i=0;i<seats.length;i++)
	{
		for(int j=0;j<seats[i].length;j++)
		{
			System.out.print(seats[i][j] + " ");
			
		}
		System.out.println();
	}
	System.out.println("Enter the seat number you want:");
	Scanner scan=new Scanner(System.in);
    String seatnumber = scan.nextLine();
	int user_row=0;
	int user_column=0;
	
	boolean found = false;
	for(int i=0;i<seats.length;i++)
	{
		for(int j=0;j<seats[i].length;j++)
		{
			if(seatnumber.equals(seats[i][j]))
			{
				user_row = i;
				user_column = j;
				found=true;
				break;
			}
			
		}
	}
	
	if(!found)
	{
		System.out.println("Invalid Input");
		seatSelection(movieNum);
	}
	
	switch(movieNum)
	{
	case 1:
		if (velu[user_row][user_column])
		{
		System.out.println("Seat available and booked successfully");
		break;
		}
		else
		{
			System.out.println("Seat already booked....");
			userInputChange();
		}
		break;
	case 2:
		if(Virumand[user_row][user_column])
		{
		System.out.println("Seat available and booked successfully");	
		}
		else
		{
			System.out.println("Seat already booked....");
			userInputChange();
		}
		break;
	case 3:
		if(Thalapathy[user_row][user_column])
		{
		System.out.println("Seat available and booked successfully");	
		}
		else
		{
			System.out.println("Seat already booked....");
			userInputChange();
		}	
		break;
	}
	
	
	
}

public void userInputChange()
{
	System.out.println("1.Select another Seat"
			+ "\n2.Select another Movie from the list");
	System.out.println("Enter 1 or 2:");
	int user_input_change = scanner.nextInt();
	if(user_input_change>2 && user_input_change<1)
	{
		System.out.println("Invalid Input Enter 1 or 2 to Proceed:");
		userInputChange();
	}
	else
	{
		if(user_input_change == 1)
		{
			seatSelection(user_input_change);
		}
		else if(user_input_change == 2)
		{
			movieDetials();
		}
	}
}

			            
}

