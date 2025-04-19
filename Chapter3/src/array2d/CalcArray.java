package array2d;

public class CalcArray {

	public static void main(String[] args) {
		//2차원 정수형 배열 생성
		int[][] number = {
				{1,2,3,4},
				{5,6,7}
		};
		int count = 0;
		int sum = 0; //합계
		double avg; //평균
		
		//특정 요소 검색 - 인덱싱
		int x = number[1][1];
		System.out.println(x); //6
		
		//전체검색
		for(int i=0; i<number.length; i++) {
			for(int j=0; j<number[i].length; j++) {
				System.out.print(number[i][j] + " ");
		
			}
	}
		System.out.println();
		
		//배열의 크기
		System.out.println("배열의 크기: " + number.length);
		
		//요소의 합계
		for(int i=0; i<number.length; i++) {
			for(int j=0; j<number[i].length; j++) {
				sum += number[i][j];
				count++; //for문을 순회할때 1씩 증가
		}}
		//평균 
		avg = (double)sum / count;
		
	System.out.println("합계: " + sum);	
	System.out.println("개수: " + count);	
	System.out.printf("평균: %.1f",  avg);	
	}
}
