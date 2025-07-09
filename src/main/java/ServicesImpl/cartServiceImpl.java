package ServicesImpl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import Entities.Cart;
import Repositories.cartRepository;

public class cartServiceImpl 
{
	static cartRepository repo;
	
	
	@Autowired
	public cartServiceImpl(cartRepository repo) 
	{
		super();
		this.repo=repo;
	}

	public static Cart addToCart(long userId, long productId, int quantity) 
	{
		
		return repo.save(null);
	}

}
