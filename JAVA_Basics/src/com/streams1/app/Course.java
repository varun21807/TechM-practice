package com.streams1.app;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Course {
    String title;
    String instructor;
    int duration;
    double rating;
public Course(String title,String instructor,int duration,double rating) {
	this.title=title;
	this.instructor=instructor;
	this.duration=duration;
	this.rating=rating;
}

public String getTitle() {
    return title;
}

public int getDuration() {
    return duration;
}


public static void main(String args[]) {
	List<Course> course=Arrays.asList(
			new Course("Java Programming", "Alice", 15, 4.5),
			new Course("Python for Beginners", "Bob", 8, 4.0),
			new Course("Web Development", "Charlie", 20, 4.8),
            new Course("Data Science", "David", 12, 3.9));
	List<String> filter_course = course.stream()
			.filter(a->a.duration>10).map(a-> a.getTitle()+"("+a.getDuration()+"hours)")
			.collect(Collectors.toList());
	
	Course longest = course.stream()
			.max(Comparator.comparing(Course::getDuration)).orElse(null);
	
	int total_duration = course.stream().mapToInt(a->a.getDuration()).sum();
	double avg_rating = course.stream().mapToDouble(a->a.rating).average().orElse(0);
	boolean all_courses = course.stream().allMatch(a -> a.rating > 4.0);
	System.out.print("Courses and title duration :");
	System.out.println(filter_course);
	System.out.print("Longest course:");
	System.out.println(longest.title);
	System.out.print("Total duration:");
	System.out.println(total_duration);
	System.out.print("Average rating:");
	System.out.println(avg_rating);
	System.out.print("All courses have a rating of 4.0 or higher:");
	System.out.println(all_courses);
	
}
}
