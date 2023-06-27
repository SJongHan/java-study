package prob5;

public class Prob5 {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) { // 숫자 범위를 1부터 99까지로 수정
            String number = String.valueOf(i);
            String result = "";
            int clapCount = 0;

            for (int j = 0; j < number.length(); j++) {
                char digit = number.charAt(j);
                if (digit == '3' || digit == '6' || digit == '9') {
                    clapCount++;
                }
            }

            if (clapCount > 0) {
                if (clapCount > 1) {
                    result += "짝짝";
                } else {
                    result += "짝";
                }
                System.out.println(number + " " + result);
            }
        }
    }
}