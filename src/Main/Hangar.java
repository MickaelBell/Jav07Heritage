package Main;

import vehicules.Boat;
import vehicules.Car;

public class Hangar {

	public static void main(String[] args) {
		
		
		Car volkswagen = new Car("GolfSportvan", 45000);
		Car renault = new Car("ClioIV", 105000);
		Boat beneteau = new Boat("Oceanis", 800);
		Boat riva = new Boat("RivaMare", 200);
		
		
		System.out.println(volkswagen.doStuff());
		System.out.println(renault.doStuff());
		System.out.println(beneteau.doStuff());
		System.out.println(riva.doStuff());

	}

}
