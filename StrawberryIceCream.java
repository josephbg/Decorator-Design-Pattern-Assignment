/**
 * Strawberry ice cream extends icecream because it is a type of icecream
 * @author Brian Guthrie
 *
 */
public class StrawberryIceCream extends IceCream{
	
	/**
	 * This description will be used by icecreams toString
	 */
	public StrawberryIceCream() {
		this.description = "Strawberry Ice Cream";
	}
	
	/**
	 * this is the cost of a strawberry ice cream
	 */
	public double getCost() {
		return 0.8;
	}
}
