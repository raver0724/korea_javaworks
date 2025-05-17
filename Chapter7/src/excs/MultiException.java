package excs;

public class MultiException {

	public static void main(String[] args) {
		// 여러개의 예외가 발생한 경우 처리
		String[] array = {"100","123"};
		
		for(int i = 0; i <= array.length; i++) {
			try {
			System.out.println(array[1]);
			int value = Integer.parseInt(array[1]);
			System.out.println(value);
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("배열 인덱스가 초과되었습니다.");
			}catch(NumberFormatException e) {
				System.out.println("숫자로 변환할 수 없는 항목이 있습니다.");
			}
		}

	}

}
