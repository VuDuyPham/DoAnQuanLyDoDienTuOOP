package service;

import model.Product;
import java.util.ArrayList;
import java.util.List;

public class InventoryManager {

    private List<Product> products = new ArrayList<>();

    public void addProduct(Product p) {
        products.add(p);
    }

    public List<Product> getProducts() {
        return products;
    }

    public void importProduct(String id, int qty) {
        for (Product p : products) {
            if (p.getId().equals(id)) {
                p.setQuantity(p.getQuantity() + qty);
            }
        }
    }

    public void exportProduct(String id, int qty) {
        for (Product p : products) {
            if (p.getId().equals(id) && p.getQuantity() >= qty) {
                p.setQuantity(p.getQuantity() - qty);
            }
        }
    }
}