package singleton.car;

public class Car {
	//static 변수 선언(정적 변수)
	private static int seriaLNum = 1000; //기준 번호 
	private int carNumber;
	
	//생성자
	public Car() {
		seriaLNum++;
		carNumber = seriaLNum;
	}
	
	//접근자
	public int getCarNumber() {
		return carNumber;
	}
}
