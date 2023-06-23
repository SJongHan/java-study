package chapter01;

public class Ex28Gugudan2 {

	public static void main(String[] args) {
		for(int i = 2; i < 10; i++) {
			for(int j = 1; j < 10; j++) { //단
				System.out.print(j + "x" + i + "=" + j*i);
				System.out.print("\t");
			}
			
			System.out.print("\n");
		}
	}

}
