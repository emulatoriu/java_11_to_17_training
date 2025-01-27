package repository;

import java.util.List;

public class WeatherRepository {
	private final List<String> weatherTypes;

	public WeatherRepository(List<String> weatherTypes) {	
		this.weatherTypes = weatherTypes;
	}
	
	public String get(int index) {
		return weatherTypes.get(index);
	}
	
	public int size() {
		return weatherTypes.size();
	}
	

}
