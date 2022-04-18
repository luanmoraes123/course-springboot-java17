package com.luanmoraes.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luanmoraes.course.entities.OrderItem;
import com.luanmoraes.course.entities.User;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
