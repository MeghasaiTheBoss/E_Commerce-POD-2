package Services;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import Entities.Cart;
import ServicesImpl.cartServiceImpl;

public class cartService 
{
	cartServiceImpl csi;
	
	@Autowired
	public cartService(cartServiceImpl csi) 
	{
		super();
		this.csi=csi;
		
	}


	public static  Cart addToCart(Long userId, Long productId, int quantity) 
	{
		return cartServiceImpl.addToCart(userId,productId,quantity);
	}
}
