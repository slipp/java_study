package study.rentcar;

import java.util.ArrayList;
import java.util.List;

public class RentCompany {
	public static final String NEWLINE = System.getProperty("line.separator");
	
	private List<Car> cars = new ArrayList<>();
	
	private RentCompany() {}

	public static RentCompany create() {
		return new RentCompany();
	}

	public void addCar(Car car) {
		cars.add(car);
	}

	public String generateReport() {
		StringBuilder sb = new StringBuilder();
		for (Car car : cars) {
			sb.append(car.getName());
			sb.append(" : ");
			sb.append(car.getChargeQuantity());
			sb.append("리터");
			sb.append(NEWLINE);
		}
		
		return sb.toString();
	}

	@Override
	public String toString() {
		return "RentCompany [cars=" + cars + "]";
	}

}
