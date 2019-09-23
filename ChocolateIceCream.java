/**
 * chocolate ice cream extends icecream because it is a type of icecream
 * @author Brian Guthrie
 *
 */
public class ChocolateIceCream extends IceCream {
	
	/**
	 * This description will be used by icecreams toString
	 */
	public ChocolateIceCream() {
		this.description = "Chocolate Ice Cream";
	}
	
	/**
	 * this is the cost of a chocolate ice cream
	 */
	public double getCost() {
		return 0.9;
	}
}
