package io.github.camillelanglois3;

public class TripletOfDice {
	private int die1;
	private int die2;
	private int die3;
	private int numberOfSides;
	
	//the default constructor set the numberOfSides at 6
	public TripletOfDice() {
		numberOfSides=6;
	}
	
	//the 1 argument-constructor set the numberOfSides at the number in parameters
	//the value of the argument must be positive 
	public TripletOfDice(int sides) {
		if(sides<=0) throw new IllegalArgumentException("Negative argument for the number of sides :" + sides);
		numberOfSides=sides;
	}
	
	//this method change the die1, die2, and die3 values with random value 
	public void rollAllDice() {
		die1 = (int)(Math.random()*numberOfSides) + 1;
		die2 = (int)(Math.random()*numberOfSides) + 1;
		die3 = (int)(Math.random()*numberOfSides) + 1;
	}
	
	//this method change the values of the dice in parameter with a random value
	//the value in argument must be between 1 and 3
	public void rollOneDie(int dieNumber) {
		if((dieNumber<1) || (dieNumber>3)) {
			throw new IllegalArgumentException("Wrong argument for the rollOneDie method :" + dieNumber);
		}
		if(dieNumber==1) {
			die1 = (int)(Math.random()*numberOfSides) + 1;
		}
		if(dieNumber==2) {
			die2 = (int)(Math.random()*numberOfSides) + 1;
		}
		if(dieNumber==3) {
			die3 = (int)(Math.random()*numberOfSides) + 1;
		}
	}
	
	//GETTERS
	
	//this method returns the value of the first die
	public int getFirstDie() {
		return die1;
	}
	
	//this method returns the value of the second die
	public int getSecondDie() {
		return die2;
	}
	
	//this method returns the value of the third die
	public int getThirdDie() {
		return die3;
	}
}
