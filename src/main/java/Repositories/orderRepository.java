package Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import Entities.Order;

public interface orderRepository extends JpaRepository<Order, Integer> 
{

}
