public class SalaryCalculator {
	private static final double BASE_SALARY = 1000.0;

	public double multiplierPerDaysSkipped(int daysSkipped) {
		return daysSkipped > 5 ? 0.85 : 1;
	}

	public int multiplierPerProductsSold(int productsSold) {
		return productsSold > 10 ? 13 : 10;
	}

	public double bonusForProductSold(int productsSold) {
		return productsSold * multiplierPerProductsSold(productsSold);
	}

	public double finalSalary(int daysSkipped, int productsSold) {
		double salary = BASE_SALARY * multiplierPerDaysSkipped(daysSkipped) + bonusForProductSold(productsSold);
		return salary > 2000 ? 2000 : salary;
	}
}
