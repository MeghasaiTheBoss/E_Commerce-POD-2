package Controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import Entities.Cart;
import Services.cartService;

@RestController
@RequestMapping("/api")
public class cartController 
{
	
	
	cartService ser;
	
	@Autowired
	public cartController(cartService ser) 
	{
		super();
		this.ser=ser;
		
	}


	@PostMapping("/add")
	public ResponseEntity<Cart> addToCart(@RequestParam Long userId,@RequestParam Long productId,@RequestParam int quantity) 
	{
	    Cart item = cartService.addToCart(userId, productId, quantity);
	    return ResponseEntity.ok(item);
	}


	
	@GetMapping("/remove")
	public void removeFromCart(int cart_Id)
	{
		//code to remove from cart
		
	}
	
	@GetMapping("/get")
	public HashMap getCartDetails(int user_Id)
	{
		return null;
		//code to get cart details
	}
}
