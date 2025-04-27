package excs;

public class Exc {
	
	public static void P(String data) {
	
	int result = data.length();
	System.out.println("문자수: " + result);
	}

	public static void main(String[] args) {
		//예외발생
		System.out.println("[프로그램 시작]");
		try {
			P("Hello");
			P(null);
			
		}catch(NullPointerException e) {
			//NullPointerException 대신 부모인 Exception 사용가능
			System.err.println(e.getMessage());
		}
		
		
		
		
		
		System.out.println("[프로그램 종료]");
	}
}
