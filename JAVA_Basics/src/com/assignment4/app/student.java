package com.assignment4.app;
import java.util.LinkedList;
import java.util.Scanner;
public class student {
 String name;
 int rollnum;
 String dept;
 
 public student(String name,int rollnum,String dept) {
	 this.name = name;
	 this.rollnum=rollnum;
	 this.dept=dept;
 }
 public String toString() {
	 return "Student Name:"+name+"\nRoll no."+rollnum+"\nDepartment"+dept;
 }
 public static void main(String args[]) {
	 Scanner scan=new Scanner(System.in);
	 System.out.println("Enter the name");
   	 String name = scan.nextLine();
   	 System.out.println("Enter the rol no");
   	 int rollnum = scan.nextInt();
   	 scan.nextLine();
   	 System.out.println("Enter the dept");
   	 String dept = scan.nextLine();
	 LinkedList <student> stu= new LinkedList<student>();
	 student s=new student(name,rollnum,dept);
	 stu.add(s);
	 for(student s1:stu) {
	 System.out.println(s1);
	 }
 }
}