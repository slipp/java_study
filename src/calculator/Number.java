package calculator;

class Number {
	private int no;
	
	Number(String no) {
		this(Integer.parseInt(no));
	}

	Number(int no) {
		this.no = no;
	}

	Number add(Number second) {
		return new Number(this.no + second.no);
	}
	
	Number add2(Number second) {
		this.no = this.no + second.no;
		return this;
	}
	
	Number subtract(Number second) {
		return new Number(this.no - second.no);
	}
	
	Number multiply(Number second) {
		return new Number(this.no * second.no);
	}
	
	Number divide(Number second) {
		return new Number(this.no / second.no);
	}
	
	int getNo() {
		return no;
	}
}
