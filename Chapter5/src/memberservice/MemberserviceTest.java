package memberservice;

public class MemberserviceTest {

	public static void main(String[] args) {
		Memberservice service = new Memberservice();
		
		boolean result = service.login("raver0724", "124578is");
		if(result) { //result ==true
			System.out.println("로그인 되었습니다.");
		}else {
			System.out.println("아이디 또는 비밀번호가 일치하지 않습니다.");
		}
		
		service.logout();
	}

}
