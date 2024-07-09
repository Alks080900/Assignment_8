package Assignment_8_Problem2;

import java.util.List;

public class Statistics {
	public static double computeSumOfSalaries(List<EmployeeData> employees) {
		double sum = 0;
		for (EmployeeData employee : employees) {
			sum += employee.getSalary();
		}
		return sum;
	}
}
