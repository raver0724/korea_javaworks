package reference.score;


public class Student {
	private int studentId;				//학번
	private String studentName;		//이름
	private Subject korean;			//국어
	private Subject math;				//수학
	
	//생성자
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		korean = new Subject();
		math = new Subject();
	}
	//국어 점수 설정
	public void setKoreanSubject(String name, int score) {
		korean.setsubjectName(name);
		korean.setscorePoint(score);
	}
	//수학점수 설정
	public void setMathSubject(String name, int score) {
		math.setsubjectName(name);
		math.setscorePoint(score);
	}
	
	//학생의 정보를 출력 메서드
	public void showStudentInfo() {
		System.out.println(
				"학번: " + studentId +
				"\n이름: " +studentName +
				"\n국어 점수: " + korean.getScorePoint() +
				"\n수학 점수:" + math.getScorePoint());
		System.out.println("------------------------------------------");
	}
	

}
