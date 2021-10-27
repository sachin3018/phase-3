package com.sachin.ShoesShop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sachin.ShoesShop.Model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

}
