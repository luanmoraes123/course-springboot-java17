package com.luanmoraes.course.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luanmoraes.course.entities.OrderItem;
import com.luanmoraes.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
