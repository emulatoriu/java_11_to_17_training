package roulette;

import logic.RandomGenerator;

public final class EuropeanRoulette implements RouletteService {

	private final RandomGenerator randomGenerator;
	private final int MAX_NUMBER_EXCLUSIVE = 37;

	public EuropeanRoulette(RandomGenerator randomGenerator) {
		this.randomGenerator = randomGenerator;
	}

	@Override
	public String spinWheel() {
		int randomNumber = randomGenerator.getRandomNumber(MAX_NUMBER_EXCLUSIVE);
		return switch (randomNumber) {
			case 0 -> "Green 0";
			default -> String.valueOf(randomNumber);
		};

	}

}
