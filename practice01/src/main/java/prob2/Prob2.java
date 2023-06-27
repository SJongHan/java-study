package prob2;

public class Prob2 {
	public static void main(String[] args) {
		/* 코드 작성 */
		 int n = 10; // 패턴의 크기

	        for (int i = 1; i <= n; i++) {
	            for (int j = i; j < i + n; j++) {
	                System.out.print(j);
	                System.out.print("\t");
	            }
	            System.out.println();
	        }
	    }
	}