package logic;

import java.util.Random;

import repository.WeatherRepository;

public class WeatherService {
	private final Random random;
	private final WeatherRepository weatherRepository;
	
	public WeatherService(Random random, WeatherRepository weatherRepository) {
		super();
		this.random = random;
		this.weatherRepository = weatherRepository;
	}
	
	public String getRandomWeather() {
		int size = weatherRepository.size();
		int randomIndex = random.nextInt(size);
		return weatherRepository.get(randomIndex);
	}
	
	
}
