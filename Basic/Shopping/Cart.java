package Java.Basic.Shopping;

public class Cart {
    private Product products[];
    private float totalPrice;

    public void setProducts(Product prodArr[]) {
        this.products = prodArr;
        calculateTotal();
    }

    public Product[] getProducts() {
        return this.products;
    }

    public void calculateTotal() {
        for (Product product: this.products) {
            this.totalPrice += product.getPrice();
        }
    }

    public float getTotalPrice() {
        return this.totalPrice;
    }

    public int getItemCount() {
        return this.products.length;
    }
    
}
