package study.starbuzz;

import org.junit.Test;

public class CaffeineBeverageTest {

	@Test
	public void prepareRecipe_tea() {
		Tea tea = new Tea();
		tea.prepareRecipe();
	}

	@Test
	public void prepareRecipe_coffee() {
		CaffeineBeverage beverage = new Coffee();
		beverage.prepareRecipe();
		
//		if (beverage instanceof Coffee) {
//			Coffee coffee = (Coffee) beverage;
//			coffee.test();
//		}
		
		beverage = new Tea();
		beverage.prepareRecipe();
		

	}
}
