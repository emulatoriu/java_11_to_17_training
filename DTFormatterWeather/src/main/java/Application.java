import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;

import logic.DaySupporter;
import logic.WeatherService;
import repository.WeatherRepository;

public class Application {
	public static void main(String[] args) {
		List<String> weatherTypes = new ArrayList<>(List.of("sunny", "rainy", "cloudy", "windy"));
		WeatherRepository weatherRepository = new WeatherRepository(weatherTypes);
		Random random = new Random();
		WeatherService weatherService = new WeatherService(random, weatherRepository);
		String randomWeather = weatherService.getRandomWeather();
		LocalTime localTime = LocalTime.now();
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("B", Locale.US);
		DaySupporter daySupporter = new DaySupporter(dateTimeFormatter);
		String dayRepresentation = daySupporter.getDayTimeText(localTime);
		System.out.println("Tomorrow %s it will be %s".formatted(dayRepresentation, randomWeather));
		
	}
}
