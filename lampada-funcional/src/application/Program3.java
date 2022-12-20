package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;


public class Program3 {

	
	public static void main(String[] args) {
	
		List<Product> list = new ArrayList<>();
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		// consumer ** retorna uma void**
		
		list.forEach(p -> p.setPrice(p.getPrice() * 1.1));
	
		
		list.forEach(System.out::println);
	}
}
