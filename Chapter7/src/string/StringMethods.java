package string;

public class StringMethods {

	public static void main(String[] args) {
		// charAt(문자열) - 문자열에서 문자 추출
		// 문자열은 특별한 1차월 배열이다.
		String msg = "행운을 빌어요!!";
		
		char ch = msg.charAt(0); //행
		char ch2 = msg.charAt(4); //행
		System.out.println(ch);
		System.out.println(ch2);
		
		//주민등록번호에서 남여를 구분
		String jumin = "090724-3214321";
		char gender = jumin.charAt(7);
		
		switch(gender) {
		case '1':
		case '3':
			System.out.println("남성입니다.");
			break;
		case '2':
		case '4':
			System.out.println("여성입니다.");
			break;
		default:
			System.out.println("지원되지 않는 기능입니다.");
			break;
		}
		
		//substring(시작인덱스, 끝인덱스) - 여러개의 문자열 잘라내기(추출하기)
		//주민등록번호의 앞부분 - firstNum, 뒤 - secondNum
		String firstNum = jumin.substring(0, 6); //끝인덱스-1을 추출
		System.out.println("생년월일: " + firstNum);
		
		String secondNum = jumin.substring(7);
		System.out.println("주민번호 뒷자리: " + secondNum);
				
	}

}
