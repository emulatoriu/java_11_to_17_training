import java.util.List;

import data.Employee;
import logic.EmployeeService;

public class Application {
	public static void main(String[] args) {
		EmployeeService employeeService = new EmployeeService();
		Employee employee1 = new Employee("Darth", "Vader", 100);
		Employee employee2 = new Employee("Luke", "Skywalker", 70);
		Employee employee3 = new Employee("Obivan", "Kenobi", 130);
		List<Employee> employees = List.of(employee1, employee2, employee3);
		List<Employee> sortedEmployees = employeeService.getEmployeesSortedByExperience(employees);
		System.out.println(sortedEmployees);
		// sortedEmployees.remove(employee3);
		// System.out.println(sortedEmployees);
	}
}
