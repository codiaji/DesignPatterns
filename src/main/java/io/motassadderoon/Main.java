package io.motassadderoon;

public class Main {
    public static void main(String[] args) {
        ProductCatalog catalog = new ProductCatalog();
        ProductLister lister = new ProductLister(catalog);

        lister.listAllProducts();
        System.out.println("---");
        lister.listExpensiveProducts(100.0);
    }
}