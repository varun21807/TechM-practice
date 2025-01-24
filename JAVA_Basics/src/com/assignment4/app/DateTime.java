package com.assignment4.app;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class DateTime {
  public static void main(String args[]) {
	  LocalDate date,dateOfjoining,monthPlus,nextTues,preTues;
	  Scanner scan=new Scanner(System.in);
	  String bDate=scan.nextLine();
	  dateOfjoining=LocalDate.parse(bDate);
	  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	  String doj=dateOfjoining.format(formatter);
	  System.out.println(doj);
	  System.out.println(dateOfjoining);
	  System.out.println("Day of the date : "+dateOfjoining.getDayOfWeek());
  }
}
