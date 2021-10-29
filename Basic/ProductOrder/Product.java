package Java.Basic.ProductOrder;
public class Product {
    int productCode;
    String productName;
    float rating, price;

    void discountOffers (int offerCode) {
        if (offerCode == 5050 && price >= 10000)
            price -= 5000;
    }
}
