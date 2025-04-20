package reference.score2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student lee = new Student(1001, "이정후");
		Student s = new Student(1002, "신유빈");
		
		//과목추가
		lee.addSubject("국어", 90);
		lee.addSubject("수학", 90);
		lee.addSubject("과학", 90);
		
		s.addSubject("국어", 90);
		s.addSubject("수학", 90);
		s.addSubject("과학", 90);
		

		
		//정보출력
		lee.displayInfo();
		s.displayInfo();

	}

}
