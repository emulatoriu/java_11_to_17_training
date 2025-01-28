package logic;

import java.util.Random;

public class RandomGenerator {
	private final Random random;

	public RandomGenerator(Random random) {		
		this.random = random;
	}
	
	public int getRandomNumber(int upperBoundExluded) {
		return random.nextInt(upperBoundExluded);
	}
}
