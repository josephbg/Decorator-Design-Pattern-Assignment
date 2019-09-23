/**
 * IceCream class is abstract because each icecream is different
 * @author Brian Guthrie
 *
 */
public abstract class IceCream {
	
	/**
	 * description is protected because the each icecream has a different description
	 */
	protected String description;
	
	/**
	 * toString returns description so it displays the ordered icecreams description
	 */
	public String toString() {
		return description;
	}
	
	/**
	 * make getcost abstract because each icecream has a different cost
	 */
	public abstract double getCost();
	
}
