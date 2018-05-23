package data_structures;

import java.util.Random;

public class Randomness {
	boolean trueOrFalse() {
		Random r = new Random();
		int tf = r.nextInt(2);
		System.out.println(tf);
		if (tf == 1) {
			return true;
		}else {
			return false;
		}
	}
	int zeroToTen() {
		Random r = new Random();
		int n = r.nextInt(10);
		return n;
	}
}
