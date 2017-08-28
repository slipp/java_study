package study.rentcar;

public abstract class Car {
	private int tripDistance;
	
	public Car(int tripDistance) {
		this.tripDistance = tripDistance;
	}
	
    /**
     * 리터당 이동 거리. 즉, 연비
     */
	abstract double getDistancePerLiter();

    /**
     * 여행하려는 거리
     */
	double getTripDistance() {
		return this.tripDistance;
	}

    /**
     * 차종의 이름
     */
    abstract String getName();

    /**
     * 주입해야할 연료량을 구한다.
    */
    double getChargeQuantity() {
        return getTripDistance() / getDistancePerLiter();
    }
}
