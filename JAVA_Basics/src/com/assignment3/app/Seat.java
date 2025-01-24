package com.assignment3.app;

import java.util.Scanner;

public class Seat {
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
		Scanner scanner=new Scanner(System.in);
		System.out.println("1.Select another Seat"
				+ "\n2.Select another Movie from the list");
		System.out.println("Enter 1 or 2:");
		int user_input_change = scanner.nextInt();
		Movie m=new Movie();
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
				m.movieDetials();
			}
		}
	}

				            
	}



