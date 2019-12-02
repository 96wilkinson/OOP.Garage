package OOP.Garage;

public abstract class Car extends Vehicle {

	private boolean airbags;

	public Car(int numberOfWheels, String colour, int price, boolean airbags,String carType) {
		this.setNumberOfWheels(numberOfWheels);
		this.setColour(colour);
		this.setPrice(price);
		this.setAirbags(airbags);
		this.setCarType(carType);

	}

	public boolean isAirbags() {
		return airbags;
	}

	public void setAirbags(boolean airbags) {
		this.airbags = airbags;
	}
}
