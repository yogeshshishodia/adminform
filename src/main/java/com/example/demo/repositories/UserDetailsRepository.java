package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.User;
import com.example.demo.entities.UserDetails;

@Repository
public interface UserDetailsRepository extends CrudRepository<UserDetails, Long> {

	User findByEmail(String email);
}
