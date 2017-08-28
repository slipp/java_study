package study.rentcar;

public class Avante extends Car {

	public Avante(int tripDistance) {
		super(tripDistance);
	}

	@Override
	double getDistancePerLiter() {
		return 15.0;
	}

	@Override
	String getName() {
		return "Avante";
	}
}
