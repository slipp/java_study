package study.rentcar;

public class K5 extends Car {
	public K5(int tripDistance) {
		super(tripDistance);
	}

	@Override
	double getDistancePerLiter() {
		return 13.0;
	}

	@Override
	String getName() {
		return "K5";
	}
}
