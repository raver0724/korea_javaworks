package memberservice;

public class Memberservice {
	
	//로그인 일치혀부를 반환하는 메서드
	public boolean login(String id, String password) {
		//id - "raver0724", password = "124578is"
		//
		if(id.equals("raver0724")&&password.equals("124578is"))
			return true;
		return false;
	}
	
	
	
	//로그아웃을 실행하는 메서드
	public void logout() {
		System.out.println("로그아웃 되었습니다.");
	}

}
