package nestedfor;

import java.util.Scanner;


public class Seats {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입장객 수 입력: ");
		int customer = sc.nextInt();
		
		System.out.print("좌석 수 입력: ");
		int column = sc.nextInt();
		
		
		
		
		//int customer = 22;
		//int column = 5;
		int row;
		
		
		if(customer % column == 0) {
			row = (int)(customer / column);
			
		}else {
			row = (int)(customer / column) + 1;
		}
		
		//행 = row 열 = column
		System.out.println("==========자리배치도=========");
		for(int i=0; i<row; i++) {
			for(int j=1; j<=column; j++) {
				int seat = i*column+j;
				if(seat > customer) break;
				System.out.print("좌석" + seat + " ");
			}
			System.out.println();
		}

	}

}
