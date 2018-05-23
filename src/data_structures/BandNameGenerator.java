package data_structures;

import java.util.ArrayList;
import java.util.Random;

public class BandNameGenerator {
	public static void main(String[] args) {
		ArrayList<String> adjectives = new ArrayList<>();
		ArrayList<String> pluralNoun = new ArrayList<>();
		Random r = new Random();
		adjectives.add("unkept");
		adjectives.add("ugly");
		adjectives.add("bald");
		adjectives.add("tender");
		adjectives.add("uptight");
		pluralNoun.add("horses");
		pluralNoun.add("seats");
		pluralNoun.add("trees");
		pluralNoun.add("mountials");
		int num = r.nextInt(5);
		int num1 = r.nextInt(4);
		System.out.println("The " + adjectives.get(num) + " " + pluralNoun.get(num1) + ".");
	}
}
