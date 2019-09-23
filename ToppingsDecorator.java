/**
 * Toppings Decorator class is abstract because each topping is different and it extends IceCream class because toppings are what
 * go on ice cream
 * @author Brian Guthrie
 *
 */
public abstract class ToppingsDecorator extends IceCream {
	
	/**
	 * toString is abstact because each topping is a child of toppings decorator and each toppings string is different
	 */
	public abstract String toString();
}
