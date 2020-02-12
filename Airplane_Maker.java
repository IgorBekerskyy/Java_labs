package ua.lviv.iot.firstLaba;

public class Airplane_Maker {

	public static void main(String[] args) {
		Airplane.printStaticCURRENT_FLIGHT_RANGE();

		Airplane boeing = new Airplane();
		boeing.resetValues("Boeing", 500, 333, 30302, 400, 70, 250);
		Airplane boeing_747 = new Airplane("Boeing_747", 700, 250, 40787);
		Airplane boeing_747_400 = new Airplane("Boeing 747-400", 555, 300, 30989, 350, 55, 4);

		System.out.println(boeing.toString());
		boeing.printName();
		boeing.prinFuelTankCapacity();
		boeing.printNumberOfPassengers();
		boeing.printCruisingSpeed();
		boeing.printNumberOfEngines();
		boeing.printWeight();
		boeing.printWingArea();

		System.out.println(boeing_747.toString());
		boeing_747.printName();
		boeing_747.prinFuelTankCapacity();
		boeing_747.printNumberOfPassengers();
		boeing_747.printCruisingSpeed();
		boeing_747.printNumberOfEngines();
		boeing_747.printWeight();
		boeing_747.printWingArea();

		System.out.println(boeing_747_400.toString());
		boeing_747_400.printName();
		boeing_747_400.prinFuelTankCapacity();
		boeing_747_400.printNumberOfPassengers();
		boeing_747_400.printCruisingSpeed();
		boeing_747_400.printNumberOfEngines();
		boeing_747_400.printWeight();
		boeing_747_400.printWingArea();

		Airplane[] airplanes = new Airplane[4];
		for (int i = 0; i < airplanes.length; i++) {
			airplanes[i] = new Airplane("Òó-144-D-" + i, i + 1 * 10, i + 1 * 20, i + 1 * 15, i + 1 * 150, i + 1 * 3000,
					i + 1 * 500);
		}

		int i = airplanes.length - 1;

		while (i >= 0) {
			Airplane airplane = airplanes[i];
			System.out.println(airplane.toString());
			airplane.printName();
			airplane.prinFuelTankCapacity();
			airplane.printNumberOfPassengers();
			airplane.printCruisingSpeed();
			airplane.printNumberOfEngines();
			airplane.printWeight();
			airplane.printWingArea();
			i--;
		}
	}
}
