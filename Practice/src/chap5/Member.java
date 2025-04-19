package chap5;

public class Member {

	private String id; //책 제목
	private String password; //작가
	
	public Member(String id, String password) {
		this.id = id;
		this.password = password;
		
	}
	
	//책의 정보를 출력하는 매서드
	public void showMemberInfo() {
		System.out.println(id + ", " + password);
	}

}
