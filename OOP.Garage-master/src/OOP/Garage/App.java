package OOP.Garage;

public class App {
	
	public static void main(String[] args) {

		Garage g = new Garage();
		g.getGarage().add(new Fiat());
		g.getGarage().add(new HarleyDavidson());
		g.getGarage().add(new MonsterTruck());
		for (int i = 0; i < g.getGarage().size(); i++) {
			System.out.println(g.getGarage().get(i));
		}
	}
}
