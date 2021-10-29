package Java.Basic.Shopping;

public class Order {
    public static void main(String[] args) {
        
        Product laptop = new Laptop("Dell Inspiron 15", 123, 45000, "Linux Ubuntu", "16GB");
        Product book = new Book("The Secret", 789, 399, "Rhonda Bryne", "Self-Help");
        Product shirt = new Apparel("Thin Stripes Medium", 4567, 299, "Cotton", "Blue");
        Product football = new Product("Nike Blue", 5787, 1500);
        Product pizza = new Product("Chicken Capsicum Large", 942, 600);

        Product products[] = {laptop, book, shirt, football, pizza};

        Cart cartMukul = new Cart();
        cartMukul.setProducts(products);

        Customer mukul = new Customer(469, "Mukul");
        mukul.setCart(cartMukul);

        displayOrder(mukul);
    }

    public static void displayOrder(Customer cust) {
        
        Cart cart = cust.getCustCart();
        float totalPrice = cart.getTotalPrice();
        int itemCount = cart.getItemCount();
        Product prods[] = cart.getProducts();

        System.out.println("\nHello " + cust.getCustName()+ " (ID: " + cust.getCustId() + ")");
        System.out.println("You have " + itemCount + " items in your cart.\n");

        
        for (Product prod: prods) {
            prod.printDetails();
        }

        /*
        System.out.println("\nProductID \t Product \t Price");
        for (Product prod : prods) {
            String pName = prod.getPName();
            int pId = prod.getPId();
            float pPrice = prod.getPrice();
            System.out.println(pId+ " \t\t " + pName + " \t\t " + pPrice);
        }
        */

        System.out.println("\nYour total price = ₹" + totalPrice + '\n');
    }
}

