package de.odisho.store.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import de.odisho.store.modle.Product;


// all the logic will be in the service

@Service
public class ProductService {

    // Dummy Data
    List<Product> products = new ArrayList<>(Arrays.asList(
        new Product(101, "iPhone", 1200),
        new Product(102, "macbook", 3500),
        new Product(103, "mac studio", 4000)
    ));

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
        
    }
}
