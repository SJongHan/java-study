package chapter01;

public class Ex14IfStatement {

	public static void main(String[] args) {

		int n1 = 80;
		int n2 = 100;
		
		System.out.println("---초기값---");
		System.out.println("n1: " + n1);
		System.out.println("n2: " + n2);
		
		// Q1: n1값이 항상 큰 값이 되도록, 필요할 경우 n1과 n2를 교체하라.
		if(n1 < n2) {
			// swap
			int n3 = n1;
			n1 = n2;
			n2 = n3;
		}
		
		
		System.out.println("---결과값---");
		System.out.println("n1: " + n1);
		System.out.println("n2: " + n2);
		
		
		// Q2: 최대값을 판별하는 조건을 완성해 보세요.
		int a1 = 730;
		int a2 = 500;
		int a3 = 500;

		if (a1 >= a2) {
			if(a1 >= a3) {
				System.out.println("최대값은" + a1 + "입니다");
			} else {
				System.out.println("최대값은" + a3 + "입니다");
			}
		} else if(a2 >= a3){
			if(a2 >= a1) {
				System.out.println("최대값은" + a2 + "입니다");				
			} else {
				System.out.println("최대값은" + a1 + "입니다");
			}
		} else {
			System.out.println("최대값은" + a3 + "입니다");
		}
		
		
		

	}
}
