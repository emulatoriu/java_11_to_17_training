package logic;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import data.Employee;

public class EmployeeService {
	public List<Employee> getEmployeesSortedByExperience(List<Employee> employees) {
		return employees.stream()
				.collect(Collectors.toMap(employee->employee, 
						employee->ChronoUnit.DAYS.between(LocalDate.now(), employee.entryDate())))
				.entrySet()
				.stream()
				.sorted(Map.Entry.comparingByValue())				
				.map(Map.Entry::getKey)
				.toList();
	}
}
