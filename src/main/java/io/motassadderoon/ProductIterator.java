package io.motassadderoon;

import java.util.List;

public class ProductIterator implements Iterator<Product> {
    private final List<Product> products;
    private int currentIndex = 0;

    public ProductIterator(List<Product> products) {
        this.products = products;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < products.size();
    }

    @Override
    public Product next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        return products.get(currentIndex++);
    }
}