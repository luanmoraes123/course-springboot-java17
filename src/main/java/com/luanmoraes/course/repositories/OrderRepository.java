package com.luanmoraes.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luanmoraes.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
