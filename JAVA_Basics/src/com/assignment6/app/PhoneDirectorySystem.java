package com.assignment6.app;
import java.util.LinkedHashMap;
import java.util.Scanner;
public class PhoneDirectorySystem {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
LinkedHashMap<String, Long> directory = new LinkedHashMap<>();
directory.put("Kabali", 1234567890L);
directory.put("Samba", 678901234L);
directory.put("Bamba", 1234567890L);
directory.put("Bumba", 987654321L);
directory.put("kumba", 1234567890L);
while (true) {
System.out.println("1.Add Number\n2.Update\n3.Find Number\n4.Exit");
int choice = scan.nextInt();
scan.nextLine();
switch (choice) {
case 1:
System.out.println("Enter the name:");
String name = scan.nextLine();
System.out.println("Enter the Phone number:");
long number = scan.nextLong();
directory.put(name, number);
break;
case 2:
System.out.println("Enter the name:");
String update_name = scan.nextLine();
if (directory.containsKey(update_name)) {
System.out.println("Enter the Phone number to be Update:");
long update_number = scan.nextLong();
directory.put(update_name, update_number);
System.out.println("Updated");
} else {
System.out.println("Name not found");
}
break;
case 3:
System.out.println("Enter the name to find:");
String find_name = scan.nextLine();
if (directory.containsKey(find_name) ) {
System.out.println("Phone number: " +
directory.get(find_name));
} else {
System.out.println("Name is not found");
}
break;
case 4:
System.out.println("Exited");
return;
default:
System.out.println("Invalid input enter a valid input");
}
}
}
}