package chap2;

public class Bread {

	public static void main(String[] args) {
	//빵 25개를 4명이 나눠가질경우 각자의 몫과 남은 빵의 개수
	int bread = 25;
	int preson = 4;
	int share, remainder;
	
	share = bread / preson;
	remainder = bread % preson;
	
	System.out.println("각각의 빵의 몫은: " + (bread /  4) + "입니다.");
	System.out.println("남은 빵의 개수는: " + (bread %  4) + "입니다.");
	
	System.out.println("각각의 빵의 몫은: " + share + "입니다.");
	System.out.println("남은 빵의 개수는: " + remainder + "입니다.");
	
}
}
