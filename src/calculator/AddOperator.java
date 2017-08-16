package calculator;

public class AddOperator implements Operator {

	@Override
	public int operate(int first, int second) {
		return first + second;
	}

}
