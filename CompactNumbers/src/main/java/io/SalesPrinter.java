package io;

import java.text.NumberFormat;
import java.util.List;

public class SalesPrinter {
	
	private final NumberFormat numberFormat;
	
	public SalesPrinter(NumberFormat numberFormat) {
		this.numberFormat = numberFormat;
	}

	public void printSales(List<Double> sales) {
		sales.forEach(sale -> System.out.println(
				"""
				Original: %f,
				Formatted: %s
				"""			.formatted(sale, numberFormat.format(sale))	
				));
	}
}
