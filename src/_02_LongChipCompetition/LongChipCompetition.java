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
		String name = "";
		double currentLongestChip=0.0;
		LongChipCompetition lcc = new LongChipCompetition();
		initializeBeatles();
		for (int i = 0; i < theBeatles.size(); i++) {
			Beatle beatle = theBeatles.get(i);
			//System.out.println(beatle.getChips());
			ArrayList<Chip> b = beatle.getChips();
			
	        for (int j = 0; j < b.size(); j++) {
	        	Chip num = b.get(j);
				if(num.getLength()>currentLongestChip) {
					currentLongestChip = num.getLength();
					name=beatle.getName();
				}
			}
	        
		} 
		System.out.println(name+" "+currentLongestChip);
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
