package Prototype;

public class Product extends ProductPrototype {

    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public Product clone() {
        return new Product(name, price);
    }

    @Override
    public void display() {
        System.out.println("name:" + name + " and price " + price);
    }
}
