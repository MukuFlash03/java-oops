package Java.Advanced.LambdaExpr;

import java.util.*;

public class StreamEx1 {
	public static void main(String[] args) {
		//Assume these data pulled from DB ....
			Product p1=new Product(101, "T Shirt", 1999.99f, 4.5f);
			Product p2=new Product(102, "Jeans", 1899.99f, 4.0f);
			Product p3=new Product(103, "USB", 500.99f, 4.7f);
			Product p4=new Product(104, "Mouse", 600.99f, 3.5f);
			Product p5=new Product(105, "keyboard", 1299.99f, 4.4f);

			ArrayList<Product> prodList=new ArrayList<Product>();

			prodList.add(p1);
			prodList.add(p2);
			prodList.add(p3);
			prodList.add(p4);
			prodList.add(p5);
			
			
			/*
			Consumer <Product> cons = (p) -> System.out.println(p.getProdName());
			Predicate <Product> pred = (p) -> p.getPrice() >= 1500;
			prodList.stream().filter(pred).forEach(cons);
			*/

			prodList.stream().filter((p) -> p.getPrice() >= 1500).
			filter((p) -> p.getProdName().equals("Jeans")).
			forEach((p) -> System.out.println(p.getProdName()));

			// Comparator<Product> highPrice = (Product p1, Product p2) -> p1.getPrice().compareTo(p2.getPrice());

			System.out.println("----------xxx----------\n");
			System.out.println("Max Priced Product");
			System.out.println(
			prodList.stream()
			.max((pA, pB) -> 
				(pA.getPrice() > pB.getPrice() ? 1 : -1))
			.get()
			);

			System.out.println("----------xxx----------\n");
			System.out.println("Min Priced Product");
			System.out.println(
			prodList.stream()
			.min((pA, pB) -> 
				(pA.getPrice() > pB.getPrice() ? 1 : -1))
			.get()
			);

			System.out.println("----------xxx----------\n");
			System.out.println("Highest to Lowest Priced Products");
			prodList.stream()
			.filter((p) -> p.getRatings() > 4)
			.sorted((pA, pB) -> 
				(pA.getPrice() > pB.getPrice() ? -1 : 1))
			.forEach(System.out::println);
			// same as forEach((p) -> System.out.println(p));

			System.out.println("----------xxx----------\n");
			System.out.println("Lowest to Highest Priced Products");
			prodList.stream()
			.filter((p) -> p.getRatings() > 4)
			.sorted((pA, pB) -> 
				(pA.getPrice() > pB.getPrice() ? 1 : -1))
			.forEach(System.out::println);

			System.out.println("----------xxx----------\n");
			
	}


}