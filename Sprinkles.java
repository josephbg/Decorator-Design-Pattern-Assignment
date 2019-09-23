/**
 * Sprinkles extends ToppingsDecorator because it is a topping and toppings decorator is an extention of icecream
 * @author Brian Guthrie
 *
 */
public class Sprinkles extends ToppingsDecorator{
	
	/**
	 * create an instance of icecream so you can add this topping
	 */
	IceCream icecream;
	
	/**
	 * 
	 * @param icecream
	 */
	public Sprinkles(IceCream icecream) {
		this.icecream = icecream;
	}
	
	/**
	 * this adds the topping sprinkles to the string order
	 */
	public String toString() {
		return icecream.toString() + " + sprinkles";
	}
	
	/**
	 * this adds the cost of sprinkles to the string order
	 */
	public double getCost() {
		return icecream.getCost() + 0.2;
	} 
}
