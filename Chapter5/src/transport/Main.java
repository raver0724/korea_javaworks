package transport;

public class Main {

	public static void main(String[] args) {
		// person 객체 생성
		Person p1 = new Person("권우진", 10000);
		Person p2 = new Person("조명수", 14000);
		
		//Bus 객체 생성
		Bus bus100 = new Bus(100);
		
		//버스요금
		int fee0fBus = 1500;
		
		//버스 승차
		p1.takeBus(bus100, fee0fBus);
		p2.takeBus(bus100, fee0fBus);
	
		
		
		
		//정보 출력
		p1.personInfo();
		p2.personInfo();
		bus100.busInfo();

	}

}
