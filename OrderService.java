package application;



import java.util.ArrayList;
import application.Cart;
import application.CartItem;


public class OrderService {
    
    private Cart cart;
    
    public OrderService() {
        this.cart = new Cart(new ArrayList<>(), 0);
    }
    
    public void addToCart(CartItem cartItem) {
        this.cart.addItemToCart(cartItem);
    }
    
    public void clearCart() {
        this.cart = new Cart(new ArrayList<>(), 0);
    }
    
    public Cart getCart() {
        return this.cart;
    }
}

