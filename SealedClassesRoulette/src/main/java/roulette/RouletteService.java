package roulette;

public sealed interface RouletteService permits EuropeanRoulette, AmericanRoulette {
	String spinWheel();
}
