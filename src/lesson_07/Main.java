package lesson_07;

public class Main {

	public static void main(String[] args) {
		
		Su_27 SU27 = new Su_27(1500, "Black");
		
		SU27.engineStart();
		SU27.aircraftTakeOff();
		SU27.moveUp();
		SU27.moveLeft();
		SU27.moveDown();
		SU27.moveRight();
		SU27.stealth();
		SU27.nuke();
		SU27.nitro();
		SU27.aircraftLanding();
	}
}
