package com.streams1.app;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.*;

public class Student {
    public String name;
    public  int age;
    public float grade;
    
public Student(String name,int age,float grade) {
	this.name=name;
	this.age=age;
	this.grade=grade;
}
public float getgrade() {
	return grade;
}
public String toString() {
	return "Name:"+name+"\nAge:"+age+"\nAverage grade:"+grade+"\n";
}
public static void main(String args[]) {
	List<Student> student=Arrays.asList(
			new Student("Alice",17,85.5f),
			new Student("Bob", 19, 75.2f),
			new Student( "Charlie", 20, 95.0f),
			new Student(  "David", 22, 65.4f),
			new Student( "Eve", 18, 88.3f));
	System.out.println("Students who are younger than 18:");
	student.stream().filter(a->a.age>=18)
	.sorted(Comparator.comparingDouble(Student::getgrade).reversed()).
	limit(3).
	forEach(a->System.out.println(a));

	
}
}
