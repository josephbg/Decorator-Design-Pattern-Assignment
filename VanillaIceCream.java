/**
 * vanilla ice cream extends icecream because it is a type of icecream
 * @author Brian Guthrie
 *
 */
public class VanillaIceCream extends IceCream {
	
	/**
	 * This description will be used by icecreams toString
	 */
	public VanillaIceCream() {
		this.description = "Vanilla Ice Cream";
	}
	
	/**
	 * this is the cost of a vanilla ice cream
	 */
	public double getCost() {
		return 0.75;
	}
}
