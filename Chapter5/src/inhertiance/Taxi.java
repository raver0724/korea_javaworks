package inhertiance;


public class Taxi extends Car{
	int passenger;
	
	Taxi(String brand, int year, int passenger) {
		super(brand, year);  //부모 멤버 상속
		this.passenger = passenger;
	}
	
	@Override
	void carInfo() {
	System.out.println("모델명: " + brand);	
	System.out.println("연식: " + year);	
	System.out.println("승객수: " + passenger);
	}

}
