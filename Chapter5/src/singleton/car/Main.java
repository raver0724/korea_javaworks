package singleton.car;

public class Main {

	public static void main(String[] args) {
		// 자동차 공장 객체 생성
		CarFactory factory = CarFactory.getInstance();

		//자동차 공장에서 자동차 생성
		Car M4 = factory.createCar();
		Car M5 = factory.createCar();
		Car Z4 = factory.createCar();
		
		System.out.println("M4 번호: " + M4.getCarNumber());
		System.out.println("M5 번호: " + M5.getCarNumber());
		System.out.println("Z4 번호: " + Z4.getCarNumber());
	}

}
