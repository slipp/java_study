package calculator;

public class StringCalculator {

	public int calculate(String text) {
		String[] values = split(text);
		Expression expression = new Expression(toInt(values[0]), values[1], toInt(values[2]));
		return expression.operate();
	}

	private String[] split(String text) {
		String[] values = text.split(" ");
		if (values.length < 3) {
			throw new IllegalArgumentException();
		}
		return values;
	}

	private int toInt(String value) {
		return Integer.parseInt(value);
	}


	

}
