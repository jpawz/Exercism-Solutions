class CalculatorConundrum {
	public String calculate(int operand1, int operand2, String operation) {
		switch (operation) {
		case "+":
			return String.format("%d + %d = %d", operand1, operand2, operand1 + operand2);
		case "-":
			return String.format("%d - %d = %d", operand1, operand2, operand1 - operand2);
		case "*":
			return String.format("%d * %d = %d", operand1, operand2, operand1 * operand2);
		case "/":
			return String.format("%d / %d = %d", operand1, operand2, operand1 / operand2);
		default:
			throw new IllegalOperationException("");
		}
	}
}
