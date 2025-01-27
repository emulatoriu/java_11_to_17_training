import java.time.LocalDate;
import java.util.List;

import data.Employee;
import logic.EmployeeService;

public class Application {
	public static void main(String[] args) {
		EmployeeService employeeService = new EmployeeService();
		Employee employee1 = new Employee("Darth", "Vader", LocalDate.of(1900, 1, 1));
		Employee employee2 = new Employee("Luke", "Skywalker", LocalDate.of(1930, 1, 1));
		Employee employee3 = new Employee("Obivan", "Kenobi", LocalDate.of(1870, 1, 1));
		List<Employee> employees = List.of(employee1, employee2, employee3);
		List<Employee> sortedEmployees = employeeService.getEmployeesSortedByExperience(employees);
		System.out.println(sortedEmployees);
	}
}
