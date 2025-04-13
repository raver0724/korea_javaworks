package transport;

public class Bus {
	private int busNumber; // 버스번호
	private int passenger; //승객수
	private int money; //버스의 수입
	
	//생성자
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	
	//승객을 태우는 매서드
	public void take(int money) {
		this.money += money; // this.money = this.money + money
		passenger++;
	}
	
	public void busInfo() {
		System.out.println(busNumber + "번 버스의 수입은 " + money + "원이고, 승객 수는 " + passenger + "명 입니다.");
	}

}


