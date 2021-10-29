package Java.Advanced.LambdaExpr;
import java.util.*;
import java.util.stream.Stream;

public class DoubleStreamEx1 {

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
			
            double totalPriceR4_5 = Stream.of(p1,p2,p3,p4,p5)
                                    .filter((p) -> p.getRatings() >= 4.5)
                                    .mapToDouble((p) -> p.getPrice())
                                    .sum();
            // System.out.println("Total price of products with ratings >= 4.5 is: " + totalPriceR4_5);
            System.out.printf("Total price of products with ratings >= 4.5 is: %.2f \n", totalPriceR4_5);

            double avgPrice = Stream.of(p1,p2,p3,p4,p5)
                            .mapToDouble((p) -> p.getPrice())
                            .average().
                            getAsDouble();
            // System.out.println("Average Price of products is: " + avgPrice);
            System.out.printf("Average Price of products is: %.2f \n", avgPrice);

            double avgRating = Stream.of(p1,p2,p3,p4,p5)
                            .mapToDouble((p) -> p.getRatings())
                            .average().
                            getAsDouble();
            // System.out.println("Average Rating of products is: " + avgRating);
            System.out.printf("Average Rating of products is: %.2f \n", avgRating);

            


			
			
	}


}