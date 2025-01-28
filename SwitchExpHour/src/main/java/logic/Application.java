package logic;

import java.time.LocalTime;

public class Application {

	public static void main(String[] args) {
		LocalTime localTime = LocalTime.now();
		TimeService timeService = new TimeService();
		int hour = localTime.getHour();
		String timeToText = timeService.hourToString(hour);
		System.out.println(timeToText);
	}

}
