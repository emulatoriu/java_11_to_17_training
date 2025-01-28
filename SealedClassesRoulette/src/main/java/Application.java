import java.util.Random;

import logic.RandomGenerator;
import roulette.AmericanRoulette;
import roulette.EuropeanRoulette;
import roulette.RouletteService;

public class Application {
	public static void main(String[] args) {
		Random random = new Random();
		RandomGenerator randomGenerator = new RandomGenerator(random);
		RouletteService europeanRoulette = new EuropeanRoulette(randomGenerator);
		RouletteService americanRoulette = new AmericanRoulette(randomGenerator);
		System.out.println(europeanRoulette.spinWheel());
		System.out.println(americanRoulette.spinWheel());
	}
}
