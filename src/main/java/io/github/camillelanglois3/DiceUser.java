package io.github.camillelanglois3;

public class DiceUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TripletOfDice mytriplet=rollOnce();
		System.out.println("the die number 1 is at " + mytriplet.getFirstDie());
		System.out.println("the die number 2 is at " + mytriplet.getSecondDie());
		System.out.println("the die number 3 is at " + mytriplet.getThirdDie());
	}
	
	//this method create a TripletOfDice and roll it
	public static TripletOfDice rollOnce() {
		TripletOfDice triplet = new TripletOfDice();
		triplet.rollAllDice();
		return triplet;
	}

}
