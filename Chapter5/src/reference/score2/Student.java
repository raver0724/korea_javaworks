package reference.score2;

import reference.score.Subject;

public class Student {
	private int studentId;
	private String studentName;
	private Subject[] subjects; //Subject 배열 선언
	
	//생성자
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		subjects = new Subject[10];
	}
	
	//과목 추가
	public void addSubject(String name, int score) {
		Subject subject = new Subject();  //과목 객체 생성
		subject.setsubjectName(name);
		subject.setscorePoint(score);
		
		for(int i=0; i<subjects.length; i++) {
			if(subjects[i] == null) {
				subjects[i] = subject;
				break;
			}}
		}
	public void displayInfo() {
		int total = 0;
		int count = 0;
		double avg;
		System.out.println("학번: " + studentId +
					"\n이름: " + studentName);
		for(int i=0; i<subjects.length; i++) {
			if(subjects[i] !=null) {//배열이 비어있지 않으면
				total += subjects[i].getScorePoint();
				count++; 
				
			System.out.println(subjects[i].getSubjectName() +
					"점수: " + subjects[i].getScorePoint());
			
		}
		}
		//평균 계산
		avg = (double)total / count;
		System.out.printf("평균점수: %.1f1점", avg);
		System.out.println("\n=================");
	}
}
