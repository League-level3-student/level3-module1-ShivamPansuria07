package _02_LongChipCompetition;

import java.util.ArrayList;
import java.util.Random;

public class LongChipCompetition {
	/*
	 * The Beatles are eating lunch and playing a game to see who has the longest
	 * chip. (In England, french fries are called "chips".) Find the Beatle with the
	 * longest chip. You may not edit the Chip or Beatle classes. Make sure to
	 * initialize The Beatles before you start your search.
	 */
	private static ArrayList<Beatle> theBeatles = new ArrayList<Beatle>();

	public static void main(String[] args) {

		LongChipCompetition lcc = new LongChipCompetition();
		initializeBeatles();
		for (int i = 0; i < theBeatles.size(); i++) {
			Beatle beatle = theBeatles.get(i);
			beatle.getChips();

			ArrayList<Chip> b = beatle.getChips();

			if (beatle.getChips().get(0).getLength() > beatle.getChips().get(1).getLength()) {
				if (beatle.getChips().get(0).getLength() > beatle.getChips().get(2).getLength()) {
					if (beatle.getChips().get(0).getLength() > beatle.getChips().get(3).getLength()) {
						System.out.println(beatle.getName());
					}
				}
			}
			//second
			if (beatle.getChips().get(1).getLength() > beatle.getChips().get(0).getLength()) {
				if (beatle.getChips().get(1).getLength() > beatle.getChips().get(2).getLength()) {
					if (beatle.getChips().get(1).getLength() > beatle.getChips().get(3).getLength()) {
						System.out.println(beatle.getName());
					}
				}
			}
			//third
			if (beatle.getChips().get(2).getLength() > beatle.getChips().get(0).getLength()) {
				if (beatle.getChips().get(2).getLength() > beatle.getChips().get(1).getLength()) {
					if (beatle.getChips().get(2).getLength() > beatle.getChips().get(3).getLength()) {
						System.out.println(beatle.getName());
					}
				}
			}
			//fourth
			if (beatle.getChips().get(3).getLength() > beatle.getChips().get(0).getLength()) {
				if (beatle.getChips().get(3).getLength() > beatle.getChips().get(1).getLength()) {
					if (beatle.getChips().get(3).getLength() > beatle.getChips().get(2).getLength()) {
						System.out.println(beatle.getName());
					}
				}
			}
		}

	}

	

	private static void initializeBeatles() {
		Beatle george = new Beatle("George");
		Beatle john = new Beatle("John");
		Beatle paul = new Beatle("Paul");
		Beatle ringo = new Beatle("Ringo");
		theBeatles.add(george);
		theBeatles.add(john);
		theBeatles.add(paul);
		theBeatles.add(ringo);
	}

	public ArrayList<Beatle> getTheBand() {
		return theBeatles;
	}
}

class Beatle {
	private String name;
	private ArrayList<Chip> chips = new ArrayList<Chip>();

	public Beatle(String name) {
		this.name = name;
		initializePlateOfChips();
	}

	private void initializePlateOfChips() {
		int numberOfChips = new Random().nextInt(100);
		for (int i = 0; i < numberOfChips; i++) {
			chips.add(new Chip(new Random().nextDouble() * 10));
		}
	}

	public ArrayList<Chip> getChips() {
		return this.chips;
	}

	public String getName() {
		return this.name;
	}
}

class Chip {
	private double length;

	public double getLength() {
		return length;
	}

	Chip(double d) {
		this.length = d;
	}
}
