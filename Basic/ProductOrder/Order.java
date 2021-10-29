package Java.Basic.ProductOrder;
public class Order {
    public static void main(String[] args) {
        Product prod = new Product();
        prod.productCode = 333;
        prod.productName = "Gibson Acoustic Guitar E-123";
        prod.rating = 4.5f;
        prod.price = 12500f;

        System.out.println("Shopping Cart");
        System.out.println(prod.productCode);
        System.out.println(prod.productName);
        System.out.println(prod.price);
        System.out.println(prod.rating);
        
        prod.discountOffers(5050);
        System.out.println("Offer Price : "+prod.price);
    }
}
