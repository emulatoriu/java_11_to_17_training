package logic;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SalesService {
	public List<Double> getSales(String commaSeparatedSales) {
		return Stream.of(commaSeparatedSales.split(","))
				.map(String::trim)
				.mapToDouble(Double::parseDouble)
				.boxed()
				.collect(Collectors.toList());
	}
}
