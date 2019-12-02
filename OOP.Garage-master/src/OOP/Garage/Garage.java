package OOP.Garage;

import java.util.ArrayList;
import java.util.List;

public class Garage {
	private int id;
	private List<Vehicle> garage = new ArrayList<>();
	
	
	public List<Vehicle> getGarage() {
		return garage;
	}

	public void setGarage(List<Vehicle> garage) {
		this.garage = garage;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
