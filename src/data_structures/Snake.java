package data_structures;

public class Snake {
int viciousness;
boolean isVenomous;

Snake s = new Snake(viciousness, isVenomous);

Snake(int viciousness, boolean isVenemous) {
	this.viciousness = viciousness;
	this.isVenomous = isVenomous;
	viciousness = Randomness.getRandomInt();
	isVenomous = Randomness.getRandomBoolean();
}
}
