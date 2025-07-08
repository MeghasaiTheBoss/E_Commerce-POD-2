package Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import Entities.User;

public interface userRepository extends JpaRepository<User, Integer> 
{

}
