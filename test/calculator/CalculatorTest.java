package calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	Calculator cal;
	
	@Before
	public void setup() {
		cal = new Calculator();
	}

	@Test
	public void add() {
		int result = cal.add(3, 4);
		assertEquals(7, result);
	}
	
	@Test
	public void minus() throws Exception {
		int result = cal.minus(4, 3);
		assertEquals(1, result);
	}
	
}
