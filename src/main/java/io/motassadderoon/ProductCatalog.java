package io.motassadderoon;

import java.util.ArrayList;
import java.util.List;

public class ProductCatalog {
    private final List<Product> products;

    public ProductCatalog() {
        this.products = new ArrayList<>();
        products.add(new Product("Laptop", 1200.0));
        products.add(new Product("Mouse", 25.0));
        products.add(new Product("Keyboard", 75.0));
        products.add(new Product("Monitor", 300.0));
    }

    public List<Product> getProducts() {
        return products;
    }
}