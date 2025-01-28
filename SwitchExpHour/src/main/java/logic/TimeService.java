package logic;

public class TimeService {
	public String hourToString(int hour) {
		return switch(hour) {
			case 0 -> "Zero";
			case 1 -> "One";
			case 2 -> "Two";
			case 3 -> "Three";
			case 4 -> "Four";
			case 5 -> "Five";
			case 6 -> "Six";
			case 7 -> "Seven";
			case 8 -> "Eight";
			case 9 -> "Nine";
			case 10 -> "Ten";
			case 11 -> "Eleven";
			case 12 -> "Twelve";
			case 13 -> "Thirteen";
			case 14 -> "Fourteen";
			case 15 -> "Fifteen";
			case 16 -> "Sixteen";
			case 17 -> "Seventeen";
			case 18 -> "Eightteen";
			case 19 -> "Nineteen";
			case 20 -> "Twenty";
			case 21 -> "TwentyOne";
			case 22 -> "TwentyTwo";
			case 23 -> "TwentyThree";
			default -> {
				yield hour < 100 ? "Great" : "Not good";
				
			}
		};
	}
}
