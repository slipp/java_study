package study.rentcar;

public class Sonata extends Car {
	public Sonata(int tripDistance) {
		super(tripDistance);
	}

	@Override
	protected double getDistancePerLiter() {
		return 10.0;
	}

	@Override
	String getName() {
		return "Sonata";
	}

}
