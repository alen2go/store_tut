package de.odisho.store.modle;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Component
public class Product {
    private int prodId;
    private String prodName;
    private int price;

    public Product() {
    }

}
