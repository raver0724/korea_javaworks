package singleton;

public class ComponyTast {

	public static void main(String[] args) {
		// Compony
		Compony compony1 = Compony.getInstance();
		Compony compony2 = Compony.getInstance();
		
		//두변수가 같은 주소인지 확인
		System.out.println(compony1 == compony2);
		
		System.out.println(compony1);
		System.out.println(compony2);

	}

}
