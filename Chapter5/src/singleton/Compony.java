package singleton;

public class Compony {
	private static Compony instance;
	
	//생성자
	private Compony() {}
	
	//getinstance() 메서드 정의
	public static Compony getInstance() {
		if(instance == null)
			instance = new Compony();
		return instance;
	}
}
