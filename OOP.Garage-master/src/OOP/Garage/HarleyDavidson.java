package OOP.Garage;

public class HarleyDavidson extends Motorcycle {
	public HarleyDavidson() {
		super(2, "Black", 40000, "Motorcycle");
	}

	@Override
	public String toString() {
		return "HarleyDavidson [getCarType()=" + getCarType() + ", getNumberOfWheels()=" + getNumberOfWheels()
				+ ", getColour()=" + getColour() + ", getPrice()=" + getPrice() +  "]";
	}

}
