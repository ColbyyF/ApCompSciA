import java.util.Scanner;

public class ShopTest {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			boolean isShopping = true;
			
		ShoppingCart cart = new ShoppingCart();
		System.out.println("Would you like to add cheese to your cart?");
		boolean answerC = sc.nextBoolean();
		
		
		if( answerC == true) {
			cart.addToCart("cheese", 10.01, 1);
			System.out.println(cart.toString());
			 
			
			
			
		}	
	}
}
