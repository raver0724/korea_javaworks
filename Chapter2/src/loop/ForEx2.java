package loop;

public class ForEx2 {

	public static void main(String[] args) {
		// 문자 세트 - 아스키 코드, 유니 코드
		char ch;
		
//		ch = 97;
//		ch = (char)(ch + 1);
//		ch++;
		
		for(ch = 65; ch < 123; ch++) {
		
		System.out.println(ch + " ");
		}
		System.out.println();
		
		//한글출력 - 유니코드
		for(ch = 12593; ch < 12686; ch++) {
			System.out.println(ch + " ");
			
		}
		
		int dan = 6;
		for(int i = 1; i < 10; i++) {
			System.out.println(dan + " x " + i + " = " + (dan * i));
		}
		
		
		
		
		
	}
	

}
