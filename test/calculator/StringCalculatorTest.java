package calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class StringCalculatorTest {
	StringCalculator scal;
	
	@Before
	public void setup() {
		scal = new StringCalculator();
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void 잘못된_값() {
		scal.calculate("4 +");
	}

	@Test
	public void add() {
		int result = scal.calculate("4 + 5");
		assertEquals(9, result);
	}
	
	@Test
	public void subtract() throws Exception {
		int result = scal.calculate("4 - 5");
		assertEquals(-1, result);
	}

	@Test
	public void 곱셈() throws Exception {
		int result = scal.calculate("4 * 5");
		assertEquals(20, result);
	}
	
	@Test
	public void 나눗셈() throws Exception {
		int result = scal.calculate("4 / 2");
		assertEquals(2, result);
	}
}
