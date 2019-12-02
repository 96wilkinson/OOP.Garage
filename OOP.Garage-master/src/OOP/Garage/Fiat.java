package OOP.Garage;

public class Fiat extends Car {
	public Fiat() {
		super( 4, "red", 2000, true,"Car");
	}

	@Override
	public String toString() {
		return "Fiat [isAirbags()=" + isAirbags() + ", getCarType()=" + getCarType() + ", getNumberOfWheels()="
				+ getNumberOfWheels() + ", getColour()=" + getColour() + ", getPrice()=" + getPrice() + "]";
	}

}
