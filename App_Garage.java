package OOP.Garage;

import java.util.ArrayList;
import java.util.List;

import OOP.Garage.Vehicle;

public class App_Garage {
		public static void main(String[] args) {
			Fiat Car1 =  new Fiat();
			List<Vehicle> Garage = new ArrayList<>();
			Garage.add(Car1);
			System.out.println(Car1);
		}

}
