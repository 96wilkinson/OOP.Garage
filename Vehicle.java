package OOP.Garage;

public abstract class Vehicle  {
	
		private int id;
		private int numberOfWheels;
		private String colour;
		private int price;
		
		public int getNumberOfWheels() {
			return numberOfWheels;
		}
		public void setNumberOfWheels(int numberOfWheels) {
			this.numberOfWheels = numberOfWheels;
		}
		public String getColour() {
			return colour;
		}
		public void setColour(String colour) {
			this.colour = colour;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
	
	
}
