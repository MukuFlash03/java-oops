package Java.Advanced.LambdaExpr;

import java.util.ArrayList;
import java.util.List;


public class WOLambdaEx1 {
public static void main(String[] args) {
	//Assume these data pulled from DB ....
		Product p1=new Product(101, "T Shirt", 1999.99f, 4.5f);
		Product p2=new Product(102, "Jeans", 1899.99f, 4.6f);
		Product p3=new Product(103, "USB", 500.99f, 4.7f);
		Product p4=new Product(104, "Mouse", 600.99f, 3.5f);
		Product p5=new Product(105, "keyboard", 1299.99f, 4.4f);
		ArrayList<Product> prodList=new ArrayList<Product>();
		prodList.add(p1);
		prodList.add(p2);
		prodList.add(p3);
		prodList.add(p4);
		prodList.add(p5);
		
		filterAndDisplay(prodList, new FilterByRatings());

		// Interface object must implement interface methods
		ProductFilter filter=new ProductFilter() {
			public boolean test(Product p) {
				return p.getRatings()>=4.5 && p.getPrice()<=1000;
			}
		};
		System.out.println("---------------------");
		filterAndDisplay(prodList, filter);
		
}

//this method is doing 2 jobs 1. display the products 2. filtering the products
//Now this method is just doing only one jobs 1. display the products 
static void filterAndDisplay(List<Product> products,ProductFilter filter) {
	for(Product p:products) {
		//if(p.getRatings()>=4.5 && p.getPrice()<=1000)
		if(filter.test(p))
		System.out.println(p.getProdName()+" "+p.getPrice()+" "+p.getRatings());
	}
}
}

class FilterByRatings implements ProductFilter{
	public boolean test(Product p) {
			return p.getRatings()>=4.5;
	}
}