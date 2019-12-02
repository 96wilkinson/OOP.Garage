package OOP.Garage;

public class MonsterTruck extends Truck {
	public MonsterTruck() {
		super( 4, "Flames with black base", 56000, "Truck");
	}

	@Override
	public String toString() {
		return "MonsterTruck [getCarType()=" + getCarType() + ", getNumberOfWheels()=" + getNumberOfWheels()
				+ ", getColour()=" + getColour() + ", getPrice()=" + getPrice() + "]";
	}

}
