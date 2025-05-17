package excs;

public class Excs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Class.forName("java.long.String");
		System.out.println("찾는 클래스가 있습니다.");
		}catch(ClassNotFoundException e) {
			System.out.println("클래스를 찾을 수 없습니다");
//			e.printStackTrace();
		}finally {
			System.out.println("항상 수행됨");
		}

}
}