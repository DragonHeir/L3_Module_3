package data_structures;

import java.util.Random;

public class Randomness {
static boolean getRandomBoolean() {
	boolean r = new Random().nextBoolean();
	System.out.println(r);
	return r;
}
static int getRandomInt() {
	int r = new Random().nextInt(10)+1;
	System.out.println(r);
	return r;
}
}
