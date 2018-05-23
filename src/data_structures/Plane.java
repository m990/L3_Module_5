package data_structures;

import java.util.ArrayList;
import java.util.Random;

public class Plane {
	int numberOfPassengers = 113;
	Random n = new Random();
	ArrayList<Snake> snakeList = new ArrayList<>();
	ArrayList<Integer> venomnList = new ArrayList<>();
	Randomness r = new Randomness();
	public static void main(String[] args) {
		Plane p = new Plane();
		for (int i = 0; i < 100; i++) {
			p.snakeList.add(new Snake(p.r.zeroToTen(), p.r.trueOrFalse()));
		}
		for (Snake i: p.snakeList) {
			System.out.println(i.getVisiousness());
			System.out.println(i.getVenomnous());
		}
		for (Snake i: p.snakeList) {
			if (i.getVenomnous()) {
				p.venomnList.add(i.getVisiousness());
			}
		}
		int totalVenom = 0;
		for (int i: p.venomnList) {
			totalVenom += i;
		}
		int chanceOfDeath = (totalVenom * 10) / p.numberOfPassengers;
		System.out.println("The chance of you dying is " + chanceOfDeath + "%");
	}
}
