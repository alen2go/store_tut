package de.odisho.store.modle;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Component
@Entity
public class Product {
    @Id
    private int prodId;
    private String prodName;
    private int price;

    public Product() {
    }

}
