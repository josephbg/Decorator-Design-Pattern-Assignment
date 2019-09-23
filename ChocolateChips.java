/**
 * ChocolateChips extends ToppingsDecorator because it is a topping and toppings decorator is an extention of icecream
 * @author Brian Guthrie
 *
 */
public class ChocolateChips extends ToppingsDecorator{
	
	/**
	 * create an instance of icecream so you can add this topping
	 */
	IceCream icecream;
	
	/**
	 * This makes Icecream associated with chocolate chips
	 * @param icecream
	 */
	public ChocolateChips(IceCream icecream) {
		this.icecream = icecream;
	}
	
	/**
	 * this adds the topping chocolate chips to the string order
	 */
	public String toString() {
		return icecream.toString() + " + chocolate chips";
	}
	
	/**
	 * this adds the cost of chocolate chips to the string order
	 */
	public double getCost() {
		return icecream.getCost() + 0.3;
	} 
}
