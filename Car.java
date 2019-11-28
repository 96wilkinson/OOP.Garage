package OOP.Garage;


public abstract class Car extends Vehicle{
	
	public Car(int id,int numberOfWheels, String colour, int price) {
		this.setId(id);
		this.setNumberOfWheels(numberOfWheels);
		this.setColour(colour);
		this.setPrice(price);
		
	}
}
