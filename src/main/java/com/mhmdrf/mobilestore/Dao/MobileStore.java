package com.mhmdrf.mobilestore.Dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mhmdrf.mobilestore.Entity.Mobile;

public interface MobileStore extends JpaRepository<Mobile, Integer>{

	List<Mobile> findAll();
	
	Optional<Mobile> findByNameAndBrandAndSize(String name, String Brand, int Size);
	
	@Modifying
	@Query("update mobiles m set m.quantity = :quantity where m.id = :id")
	Optional<Mobile> updateQuantity(@Param("id") int id, @Param("quantity") int quantity);
	
	List<Mobile> findByName(String name);
	List<Mobile> findByBrand(String brand);
	List<Mobile> findByColor(String color);
	List<Mobile> findBySize(int size);
}
