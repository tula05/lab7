package lab7;

public class Vehicle {
	public int Wheel = 6 ;	
	/**
	 * This is Move like a normal people
	 */
	public void Move() {
		System.out.println("Vehicle Move by");
	}
	
	/**
	 * Just moving Vehicle like a pro.
	 * @param Name String Input name of user
	 */
	
	public void Move(String Name) {
		System.out.println("[" + Name + "]");
	}
}
