package com.sachin.ShoesShop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sachin.ShoesShop.Model.Admin;
import com.sachin.ShoesShop.Model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	@Query(value = "SELECT * FROM USERS WHERE NAME LIKE %?1%", nativeQuery = true)
	List<User> findByName(String name);
}
