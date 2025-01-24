package com.streams1.app;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Product {
     String name;
     String category;
     double price;
     int quantity;
    
public Product(String name,String category,double price,int quantity) {
	this.name=name;
	this.category=category;
	this.price=price;
	this.quantity=quantity;
}
public double getprice() {
	return price;
}
public int getquantity() {
	return quantity;
}
public double gettotalprice() {
	return price*quantity;
}
public String toString() {
	return "Product name:"+name+"\nCategory:"+category+"\nPrice:"+price+"\nQuantity:"+quantity+"\n";
}
public static void main (String args[]) {
	List<Product> product=Arrays.asList(
			new Product("Laptop", "Electronics", 1000.0, 1),
			new Product("Smartphone", "Electronics", 700.0, 2),
			new Product("Book", "Literature", 20.0, 0),
			new Product("Headphones", "Electronics", 150.0, 3),
			new Product("Desk Lamp", "Home", 50.0, 2));
	
	product.stream().filter(a->a.quantity != 0)
	.sorted(Comparator.comparingDouble(Product::gettotalprice).reversed())
	.limit(5)
	.forEach(a->System.out.println(a));


	
}
}
