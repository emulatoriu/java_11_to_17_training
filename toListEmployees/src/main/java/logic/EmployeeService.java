package logic;

import java.util.Comparator;
import java.util.List;

import data.Employee;

public class EmployeeService {
	public List<Employee> getEmployeesSortedByExperience(List<Employee> employees) {
		return employees.stream()
				.sorted(Comparator.comparing(Employee::yearsOfExperience).reversed())
				.toList();
	}
}
