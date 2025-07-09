package Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import Entities.Cart;

public interface cartRepository extends JpaRepository<Cart, Integer> 
{
	public Cart findByUserIdAndProductId(long userId,long productId);
}
