package Java.Advanced.Collections.Lists;

import java.util.*;

public class SortEx2 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        Product p1 = new Product(101, "T Shirt", 199.99f, 4.5f);
        Product p2 = new Product(102, "Jeans", 499.99f, 4.1f);
        Product p3 = new Product(103, "USB", 799.99f, 3.5f);
        Product p4 = new Product(104, "Mouse", 599.99f, 4.4f);
        Product p5 = new Product(105, "Keyboard", 999.99f, 4.3f);

        ArrayList <Product> prodList = new ArrayList <Product> ();

        prodList.add(p1);
        prodList.add(p2);
        prodList.add(p3);
        prodList.add(p4);
        prodList.add(p5);

        System.out.println("Before Sorting: ");
        for (Product p: prodList) {
            System.out.println(p); // user-defined toString() implicit call
        }

        System.out.println("Sorting order preference: ");
        System.out.println("1. Sort by Price Low to High");
        System.out.println("2. Sort by Price High to Low");
        System.out.println("3. Sort by Ratings");
        System.out.println("Enter your choice: ");

        int choice = scn.nextInt();

        switch (choice) {
            case 1:
                Collections.sort(prodList, new SortByPriceL2H());
                break;
            
            case 2:
                Collections.sort(prodList, new SortByPriceH2L());
                break;

            case 3:
                Collections.sort(prodList, new SortByRatings());
                break;

            default:
            System.out.println("Invalid Choice.");
                break;
        }

        // Collections.sort(prodList);
        // Collections.sort(prodList, new SortByRatings());

        System.out.println("After Sorting: ");
        for (Product p: prodList) {
            System.out.println(p); // user-defined toString() implicit call
        }
    }    
}
