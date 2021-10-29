package Java.Advanced.Collections.Lists;

public class Product implements Comparable <Product> {
    private String pName;
    private int pId;
    private float pPrice;
    private float pRatings;

    public Product(int pId, String pName, float pPrice, float pRatings) {
        this.pName = pName;
        this.pId = pId;
        this.pPrice = pPrice;
        this.pRatings = pRatings;
    }

    public float getPrice() {
        return this.pPrice;
    }

    public void setPrice(float price) {
        this.pPrice = price;
    }

    public String getPName() {
        return this.pName;
    }

    public void setPName(String name) {
        this.pName = name;
    }

    public int getPId() {
        return this.pId;
    }

    public void setPId(int id) {
        this.pId = id;
    }

    public float getRatings() {
        return this.pRatings;
    }

    public void setRatings(float ratings) {
        this.pRatings = ratings;
    }

    
    // Overrides and implicitly runs when println() used
    public String toString() {
        return (this.pId+ " \t\t " + this.pName + " \t\t " + this.pPrice + " \t\t " + this.pRatings);
    }
    

    public int compareTo(Product p) {
        if (this.pPrice < p.pPrice)
            return -1;
        else   
            return 1;
    }
}
