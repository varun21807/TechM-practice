package com.javafundamentals4.app;

import java.util.*;
public class Linkedlist {
	public static void main(String args[]){
	TreeSet<String> fruits = new TreeSet<>();
	fruits.add("apple");
	fruits.add("banana");
	fruits.add("apple");
	fruits.remove("apple");
	System.out.println("Remove Duplicates -While Preserving Insertion Order:"+ (fruits));
	}
	}