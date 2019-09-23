/**
 * Cherry extends ToppingsDecorator because it is a topping and toppings decorator is an extention of icecream 
 * @author Brian Guthrie
 *
 */
public class Cherry extends ToppingsDecorator {
	
	/**
	 * create an instance of icecream so you can add this topping 
	 */
	IceCream icecream;
	
	/**
	 * This makes Icecream associated with cherry
	 * @param icecream
	 */
	public Cherry(IceCream icecream) {
		this.icecream = icecream;
	}
	
	/**
	 * this adds the topping cherry to the string order
	 */
	public String toString() {
		return icecream.toString() + " + a cherry on top";
	}
	
	/**
	 * this adds the cost of cherry to the string order
	 */
	public double getCost() {
		return icecream.getCost() + 0.4;
	} 
}
