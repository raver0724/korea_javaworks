package chap4;

//import java.util.Scanner;

public class MyAbs {
	
	public static int myAbs(int x) {
		if(x < 0) {
			return -x;
		}else {
			return x;
		}
	}

	public static void main(String[] args) {
		
		int value1 = myAbs(-4);
		int value2 = myAbs(4);
		
		System.out.println("myAbs(-4) = " + value1);
		System.out.println("myAbs(4) = " + value2);
		
/*		Scanner sc = new Scanner(System.in);
		
		int x = 0;
		int y = 0;
		
		x = sc.nextInt();
				
				if(x < 0) {
					y = x * -1;
				}else {
					y = x;
				}
				System.out.println("myAbs("+x+") = " + y);
*/
	}

}
