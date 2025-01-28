package roulette;

import logic.RandomGenerator;

public final class AmericanRoulette implements RouletteService{

	private final RandomGenerator randomGenerator;
	private final int MAX_NUMBER_EXCLUDED = 38;
	
	public AmericanRoulette(RandomGenerator randomGenerator) {
		this.randomGenerator = randomGenerator;
	}

	@Override
	public String spinWheel() {
		int randomNumber = randomGenerator.getRandomNumber(MAX_NUMBER_EXCLUDED);
		return switch(randomNumber) {
			case 0 -> "Green 0";
			case 37 -> "Green 00";
			default -> String.valueOf(randomNumber);
		};
	}

}
