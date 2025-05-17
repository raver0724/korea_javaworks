package member;

public class MemberArrayListTest {

	public static void main(String[] args) {
		// ArrayList를 활용한 회원 관리 프로그램
		// MemberArrayList 관리 클래스 객체 생성
		
		//Member 객체 생성
		Member lee = new Member(1001, "이정후");
		Member s = new Member(1002, "신유빈");
		Member c = new Member(1003, "최민정");
		
		// MemberArrayList 관리 클래스 객체 생성
		MemberArrayList memberList = new MemberArrayList();
		
		//회원 저장
		memberList.addMember(lee);
		memberList.addMember(s);
		memberList.addMember(c);
		
		//회원 출력
		memberList.showAllMember();
		
		//회원 삭제
		memberList.removeMember(1002);
		
		memberList.showAllMember();
		


	}

}
