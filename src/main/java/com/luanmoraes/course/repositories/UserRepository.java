package com.luanmoraes.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luanmoraes.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	

}
