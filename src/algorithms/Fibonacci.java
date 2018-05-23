package algorithms;

public class Fibonacci {
	public static void main(String[] args) {
		int num = 0;
		int num1 = 1;
		for (int i = 0; i < 12; i++) {
			int sum = num1 + num;
			System.out.println(sum);
			num = num1;
			num1 = sum;
		}
	}
}
