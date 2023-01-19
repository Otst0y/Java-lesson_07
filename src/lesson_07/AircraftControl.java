package lesson_07;

public class AircraftControl extends Aircraft{
	
	int randomNumberUp = (int) (Math.random() * 101);
	int randomNumberDown = (int) (Math.random() * 101);
	int randomNumberLeft = (int) (Math.random() * 101);
	int randomNumberRight = (int) (Math.random() * 101);
	
	void moveUp() {
		System.out.println("The aircraft moved " + randomNumberUp + " sectors UP.");
	}
	
	void moveDown() {
		System.out.println("The aircraft moved " + randomNumberDown + " sectors DOWN.");
	}
	
	void moveLeft() {
		System.out.println("The aircraft moved " + randomNumberLeft + " sectors to the LEFT.");
	}
	
	void moveRight() {
		System.out.println("The aircraft moved " + randomNumberRight + " sectors to the RIGHT.");
	}
}
