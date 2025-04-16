package io.motassadderoon;

public class ProductLister {
    private final ProductCatalog catalog;

    public ProductLister(ProductCatalog catalog) {
        this.catalog = catalog;
    }

    public void listAllProducts() {
        Iterator<Product> iterator = catalog.createIterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            System.out.println(product.name() + " - $" + product.price());
        }
    }

    public void listExpensiveProducts(double threshold) {
        Iterator<Product> iterator = catalog.createIterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (product.price() > threshold) {
                System.out.println(product.name() + " - $" + product.price());
            }
        }
    }
}