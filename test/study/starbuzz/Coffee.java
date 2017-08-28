package study.starbuzz;

public class Coffee extends CaffeineBeverage {
	public Coffee() {
		System.out.println("Coffee");
	}
	
	public void boilWater() {
		System.out.println("찬물을 넣는다.");
	}
	
    public void brew() {
        System.out.println("필터를 활용해 커피를 내린다.");
    }

    public void addCondiments() {
        System.out.println("설탕과 우유를 추가한다.");
    }
}
