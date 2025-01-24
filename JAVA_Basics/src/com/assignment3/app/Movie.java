package com.assignment3.app;

import java.util.Scanner;

public class Movie {
	public void movieDetials(){
		Scanner scanner=new Scanner(System.in);
		String[] movies={"1. Velu - 2:00 PM",
				"2. Virumandi - 5:00 PM",
				"3. Thalapthy - 8:00 PM"};
		for(int i=0;i<movies.length;i++) {
		System.out.println(movies[i]);
	}
		System.out.println("Enter a number to select the movie:");
		int movieNum=scanner.nextInt();
		if(movieNum>3 || movieNum<1) {
			System.out.println("You have entered a invalid movie please \nSelect a valid movie");
			movieDetials();
		}
		System.out.println("The movie you have selected:"+movies[movieNum-1]);
		Seat s=new Seat();
		s.seatSelection(movieNum);
	}
}
