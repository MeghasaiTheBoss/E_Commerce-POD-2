package com.pod2.Ecommerce.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pod2.Ecommerce.Entities.User;

public interface userRepository extends JpaRepository<User, Integer> 
{

}
