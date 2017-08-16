package calculator;

class Expression {
	private Number first;
	private String operator;
	private Number second;

	Expression(int first, String operator, int second) {
		this.first = new Number(first);
		this.operator = operator;
		this.second = new Number(second);
	}
	
	int operate() {
		if (operator.equals("+")) {
			return first.add(second).getNo();
		}
		
		if (operator.equals("-")) {
			return first.subtract(second).getNo();
		}
		
		if (operator.equals("*")) {
			return first.multiply(second).getNo();
		}
		
		if (operator.equals("/")) {
			return first.divide(second).getNo();
		}
		
		throw new IllegalArgumentException();
	}
}
