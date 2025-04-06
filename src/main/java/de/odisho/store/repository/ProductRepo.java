package de.odisho.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import de.odisho.store.modle.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

}
