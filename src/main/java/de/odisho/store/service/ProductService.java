package de.odisho.store.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import de.odisho.store.modle.Product;

// all the logic will be in the service

@Service
public class ProductService {

    private final Product product;

    // Dummy Data
    List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(101, "iPhone", 1200),
            new Product(102, "macbook", 3500),
            new Product(103, "mac studio", 4000)));

    ProductService(Product product) {
        this.product = product;
    }

    public List<Product> getProducts() {
        return products;
    }

    public Product getProductById(int prodId) {
        try {

            return products.stream().filter(p -> p.getProdId() == prodId).findFirst().get();
        } catch (Exception e) {
            System.out.println("Product not available!");
            return null;
        }
    }

    public void addProduct(Product product) {
        System.out.println(product);
        products.add(product);
    }

    public void updateProduct(Product product) {
        for (Product p : products) {
            if (p.getProdId() == product.getProdId()) {
                p.setPrice(product.getPrice());
                p.setProdName(product.getProdName());
                break;
            }
        }
    }

    public void deleteProductById(Product product) {
        products.remove(product);
    }
}