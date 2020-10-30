package com.san.springcloud.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.san.springcloud.model.Product;

public interface ProductRepo extends JpaRepository<Product, Long> {

	Product findByName(String name);

}
