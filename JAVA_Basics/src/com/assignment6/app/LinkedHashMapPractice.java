package com.assignment6.app;

import java.util.LinkedHashMap;

public class LinkedHashMapPractice {
 public static void main(String srgs[]) {
	 LinkedHashMap<String,String> vehicleTypeMap=new LinkedHashMap<>();
	 vehicleTypeMap.put("car","sedan");
	 vehicleTypeMap.put("truck","pickup");
	 vehicleTypeMap.put("motorcycle","sportbike");
	 vehicleTypeMap.put("van","minivan");
	 vehicleTypeMap.put("suv","crossover");
	 System.out.println("The Vehicle tye and category LinkedHashMap:");
	 System.out.println(vehicleTypeMap);
	 LinkedHashMap<String,String> copyMap=new LinkedHashMap<>(vehicleTypeMap);
	 System.out.println("The Copy of vehicle LinkedHashMap:");
	 System.out.println(copyMap);
	 System.out.println("Retriveing motorcycle:");
	 System.out.println(copyMap.get("motorcycle"));
	 System.out.println("Removing the vhicle type van");
	 System.out.println(copyMap.remove("van"));
	 System.out.println("checking the key presence:");
	 System.out.println(copyMap.containsKey("suv"));
	 System.out.println(copyMap.containsKey("pickup"));
	 System.out.println("Checking LinkedHashMap status:");
	 System.out.println(copyMap.isEmpty());
	 System.out.println("Size of the LinkedHashMap:");
	 System.out.println(copyMap.size());
	 System.out.println("Iterating over entries:");
	 for(var s:vehicleTypeMap.entrySet()) {
		 System.out.println(s);
	 }
	 System.out.println("Retriving keys:");
	 for(var s:vehicleTypeMap.entrySet()) {
		 System.out.println(s.getKey());
	 }
	 System.out.println("Retriving values:");

	 for(var s:vehicleTypeMap.entrySet()) {
		 System.out.println(s.getValue());
	 }
 }
}
