package Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import Entities.Product;

public interface productRepository extends JpaRepository<Product, Integer> 
{

}
