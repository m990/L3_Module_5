package data_structures;

import java.util.ArrayList;
import java.util.Random;

public class DinnerDecider {
	public static void main(String[] args) {
		ArrayList<String> food = new ArrayList<>();
		food.add("chicken");
		food.add("stake");
		food.add("hamburger");
		food.add("brussel sprouts");
		food.add("whatever you want");
		Random r = new Random();
		int num = r.nextInt(5);
		System.out.println("You should have " + food.get(num) + " for dinner tonight.");
	}
}
