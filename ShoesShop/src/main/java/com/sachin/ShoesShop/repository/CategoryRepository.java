package com.sachin.ShoesShop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sachin.ShoesShop.Model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer>{

}
