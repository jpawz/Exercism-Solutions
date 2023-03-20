public class SalaryCalculator {
	private static final int DAYS_SKIPPED_THRESHOLD = 5;
	private static final int PRODUCT_SOLD_THRESHOLD = 10;
	private static final double BASE_SALARY = 1000.0;
	private static final double SALARY_LIMIT = 2000.0;

	public double multiplierPerDaysSkipped(int daysSkipped) {
		return daysSkipped > DAYS_SKIPPED_THRESHOLD ? 0.85 : 1;
	}

	public int multiplierPerProductsSold(int productsSold) {
		return productsSold > PRODUCT_SOLD_THRESHOLD ? 13 : 10;
	}

	public double bonusForProductSold(int productsSold) {
		return productsSold * multiplierPerProductsSold(productsSold);
	}

	public double finalSalary(int daysSkipped, int productsSold) {
		double salary = BASE_SALARY * multiplierPerDaysSkipped(daysSkipped) + bonusForProductSold(productsSold);
		return salary > SALARY_LIMIT ? SALARY_LIMIT : salary;
	}
}
