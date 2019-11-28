package OOP.Garage;

public class Fiat extends Car{
	public Fiat(){
		super(1,4,"red",2000);
	}

	@Override
	// Overridden terrible default string method it inherits from object default class which strings to the object location on the memory of the machine
	public String toString() {
		return "Fiat [getNumberOfWheels()=" + getNumberOfWheels() + ", getColour()=" + getColour() + ", getPrice()="
				+ getPrice() + ", getId()=" + getId() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
