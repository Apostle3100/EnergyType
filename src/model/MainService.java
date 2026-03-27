package model;

public class MainService {

	public static void main (String [] args) {
		Vehicle v1 = new Vehicle();
		System.out.println(v1);
		Vehicle v2 = new Vehicle ("Bicycle", 99.66f, EnergyType.other);
		System.out.println(v2);
		
		Bus b1 = new Bus ();
		System.out.println(b1);
		Bus b2 = new Bus ("Lux", 1000.99f, EnergyType.gas, 70, 3);
		System.out.println(b2);
		
	}
	


}
