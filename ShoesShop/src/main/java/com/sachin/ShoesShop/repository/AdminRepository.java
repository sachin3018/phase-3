package com.sachin.ShoesShop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.sachin.ShoesShop.Model.Admin;
import com.sachin.ShoesShop.Model.PurchaseReport;
import com.sachin.ShoesShop.Model.User;

@Component
public interface AdminRepository extends JpaRepository<Admin, Integer> {
	
	@Query(value = "SELECT * FROM ADMIN WHERE EMAIL = ?1", nativeQuery = true)
	Admin findByAdminEmail(String email);
	
	@Query(value = "SELECT product.name,count(*) As stock_clear FROM Orders inner join product on product.id = orders.productId inner join users on users.id = orders.userId group by product.id;", nativeQuery = true)
	List<PurchaseReport> findpurchaseReport();
}
