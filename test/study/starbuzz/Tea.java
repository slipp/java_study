package study.starbuzz;

public class Tea extends CaffeineBeverage implements Comparable<Tea> {
	@Override
	public void boilWater() {
		System.out.println("찬물을 넣는다.");
	}
	
	
    public void brew() {
        System.out.println("티백을 담근다.");
    }

    public void addCondiments() {
        System.out.println("레몬을 추가한다.");
    }


	@Override
	public int compareTo(Tea o) {
		return 0;
	}
}
