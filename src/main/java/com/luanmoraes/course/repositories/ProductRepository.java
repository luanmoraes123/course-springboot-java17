package com.luanmoraes.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luanmoraes.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
