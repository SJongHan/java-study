package prob3;

import java.util.Scanner;

public class Prob3 {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		/* 코드 작성 */
		System.out.print("숫자를 입력하세요: ");
		int number = scanner.nextInt();
		
		if(number % 2 == 0) {
			int evensum = 0;
			for(int i = 0; i <= number; i +=2) {
				evensum += i;
			}
			System.out.println("결과 값: " + evensum);
		} else {
			int oddsum = 0;
			for(int i = 1; i <= number; i +=2) {
				oddsum += i;
			}
			System.out.println("결과 값: " + oddsum);
		}
		scanner.close();
	}
}
