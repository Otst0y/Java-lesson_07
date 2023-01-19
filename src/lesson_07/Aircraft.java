package lesson_07;

public abstract class Aircraft {
	
	int aircraftLenght;
	int aircraftWidth;
	int aircraftWeight;
	
	double engineStartTime = 20.88 + Math.random() * 79.13;
	double aircraftCruisingRange = Math.random() * 1000.01;
	
	void engineStart() {
		System.out.println("Engine will START in " + engineStartTime + " seconds.");
	}
	
	void aircraftTakeOff() {
		System.out.println("Aircraft will fly " + aircraftCruisingRange + " km.");
	}
	
	void aircraftLanding() {
		System.out.println("The plane is landing.");
	}
}
