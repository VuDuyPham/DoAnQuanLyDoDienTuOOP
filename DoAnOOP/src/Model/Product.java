package model;

public class Product {
    private String id;
    private String name;
    private String brand;
    private double price;
    private int quantity;

    public Product(String id, String name, String brand, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.quantity = quantity;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getBrand() { return brand; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Object[] toRow() {
        return new Object[]{id, name, brand, price, quantity};
    }
}