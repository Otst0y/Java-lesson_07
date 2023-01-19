package lesson_07;

public class Su_27 extends AircraftControl implements AircraftSpecifications {
	
	private int maxSpeed;
	private String color;
	
	
	public Su_27(int maxSpeed, String color) {
		super();
		this.maxSpeed = maxSpeed;
		this.color = color;
	}

	
	int nukeQuantity = (int) (Math.random() * 10);
	double stealthTime = Math.random() * 11;
	int maxNitroSpeed = 2500 + (int) (Math.random() * 3501);

	@Override
	public void stealth() {
		System.out.println("Aircraft is invisible for " + stealthTime + " minutes.");
	}

	@Override
	public void nuke() {
		System.out.println("Aircraft has " + nukeQuantity + " nukes.");
	}

	@Override
	public void nitro() {
		System.out.println("Aircraft maximum NITRO speed is " + maxNitroSpeed + " km/h.");
	}

}
