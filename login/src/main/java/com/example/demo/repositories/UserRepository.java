package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entities.LoginDTO;
import com.example.demo.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {

//	@Query(select u from user u where email=?1)
//	LoginDTO getByEmail(String email);
	
	@Query("SELECT u FROM User u WHERE u.email = ?1")
	User getByEmail(String email);

//	@Query(select s from user s where email = ?1 )
}
