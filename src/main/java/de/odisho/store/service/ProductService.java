package de.odisho.store.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import de.odisho.store.modle.Product;


// all the logic will be in the service

@Service
public class ProductService {

    // Dummy Data
    List<Product> products = Arrays.asList(
        new Product(101, "iPhone", 1200),
        new Product(102, "macbook", 3500),
        new Product(103, "mac studio", 4000)
    );

    public List<Product> getProducts() {
        return products;
    }
}
