package Java.Basic.Shopping;

public class Product {
    private String pName;
    private int pId;
    private float pPrice;

    public Product(String pName, int pId, float pPrice) {
        this.pName = pName;
        this.pId = pId;
        this.pPrice = pPrice;
    }

    public float getPrice() {
        return this.pPrice;
    }

    public String getPName() {
        return this.pName;
    }

    public int getPId() {
        return this.pId;
    }

    void printDetails() {
        System.out.println(this.pId+ " \t\t " + this.pName + " \t\t " + this.pPrice);
    }
}

class Apparel extends Product {
    
    private String fabric;
    private String color;

    public Apparel(String pName, int pId, float pPrice, String fabric, String color) {
        super(pName, pId, pPrice);
        this.fabric = fabric;
        this.color = color;
    }

    void printDetails() {
        super.printDetails();
        System.out.println(this.fabric + '\t' + this.color);
    }
}

class Book extends Product {
    
    private String author;
    private String genre;

    public Book(String pName, int pId, float pPrice, String author, String genre) {
        super(pName, pId, pPrice);
        this.author = author;
        this.genre = genre;
    }

    void printDetails() {
        super.printDetails();
        System.out.println(this.author + '\t' + this.genre);
    }
}

class Laptop extends Product {
    
    private String os;
    private String ram;

    public Laptop(String pName, int pId, float pPrice, String os, String ram) {
        super(pName, pId, pPrice);
        this.os = os;
        this.ram = ram;
    }

    void printDetails() {
        super.printDetails();
        System.out.println(this.os + '\t' + this.ram);
    }
}



