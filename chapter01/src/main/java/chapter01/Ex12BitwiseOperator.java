package chapter01;

public class Ex12BitwiseOperator {

	public static void main(String[] args) {
		int a = 0x0f;
		int b = 0xf0;
		
		System.out.println(a & b);
		System.out.println(a | b);
		System.out.println(a ^ b);
		System.out.println(~a);
		System.out.println(a >> 3);
		System.out.println(a << 3);
		
		
	}

}
