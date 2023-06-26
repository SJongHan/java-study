package chapter01;

public class Ex29Array {

	public static void main(String[] args) {
		int score01 = 90;
		int score02 = 60;
		int score03 = 100;
		int score04 = 40;
		int score05 = 70;
		int score06 = 30;
		int score07 = 70;
		int score08 = 88;
		int score09 = 66;
		int score10 = 50;
		
		int sum = score01 + score02 + score03 + score04 + score05 + score06 + score07 + score08 + score09 + score10;
		double average = sum / 10;
		
		System.out.println("평균 : " + average);
		
		int[] scores = new int [] {90, 60, 55, 40, 70, 88, 48, 70, 100, 30, 70, 40, 10};
		int sum2 = 0;
		for(int i = 0; i < scores.length; i++) {
			sum2 += scores[i];
		}
		
		double average2 = sum2 / scores.length;
		System.out.println("평균 : " + average2);
			
	}

}
