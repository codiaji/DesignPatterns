package io.motassadderoon;

import java.util.List;

public class ProductLister {
    private final ProductCatalog catalog;

    public ProductLister(ProductCatalog catalog) {
        this.catalog = catalog;
    }

    public void listAllProducts() {
        List<Product> products = catalog.getProducts();
        for (Product product : products) {
            System.out.println(product.name() + " - $" + product.price());
        }
    }

    public void listExpensiveProducts(double threshold) {
        List<Product> products = catalog.getProducts();
        for (Product product : products) {
            if (product.price() > threshold) {
                System.out.println(product.name() + " - $" + product.price());
            }
        }
    }
}