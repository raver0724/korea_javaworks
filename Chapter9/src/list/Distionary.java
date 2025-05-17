package list;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Distionary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> dic = new HashMap<>();
		
		//단어와 정의 저장
		dic.put("이진수", "0과 1");
		dic.put("비트", "데이터에서 가장 작은 단위");
		dic.put("버그", "오류");
		dic.put("알고리즘", "문제해결을 위한 절차");
		
		//입력 객체 생성
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=======================");
		System.out.println("프로그램을 종료하려면 q 또는 Q를 입력하세요");
		System.out.println("=======================");
		
		while(true) {
			System.out.println("검색할 단어를 입력하세요: ");
			String word = sc.nextLine(); //입력 대기상태
			
			if(word.toLowerCase().equals("q")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			//정의된 단어 가져오기
			String definition = dic.get(word);
			if(definition != null) {
				System.out.println(definition);
			}else {
				System.out.println(word + "는 없는 단어입니다.");
			}
		}
	}

}
