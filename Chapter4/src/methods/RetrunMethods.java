package methods;

public class RetrunMethods {

	
	
	
	
	//main() - 프로그램을 실행하는 수
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		
		
		int value = square(8); //square() 호출
		double value2 = add(3.3, 2.54);
		String msg = message();
		
		
		System.out.println(value);  //square() 호출
		System.out.println(value2);  //square() 호출
		System.out.println(msg);  //square() 호출
	}

	
	
	
	//제곱수를 계산하는 함수
	public static int square(int x) { //int x = 8
		return x * x; //호출한 곳으로 값을 보내줌
	}
	
	//두 실수를 더하는 함수
	public static double add(double x, double y) {
		return x + y;
	}
	 
	//메시지를 출력하는 하뵤ㅜ
	public static String message() {
		return "생일축하해요!";
	}
	
	
}
