class CalculatorConundrum {
	public String calculate(int operand1, int operand2, String operation) {
		validateInputs(operand1, operand2, operation);

		String operationFormat = "%d %s %d = %s";
		String result = null;

		switch (operation) {
		case "+":
			result = String.format(operationFormat, operand1, operation, operand2, operand1 + operand2);
			break;
		case "-":
			result = String.format(operationFormat, operand1, operation, operand2, operand1 - operand2);
			break;
		case "*":
			result = String.format(operationFormat, operand1, operation, operand2, operand1 * operand2);
			break;
		case "/":
			result = String.format(operationFormat, operand1, operation, operand2, operand1 / operand2);
		}

		return result;
	}

	private void validateInputs(int operand1, int operand2, String operation) {
		if (operation == null) {
			throw new IllegalArgumentException("Operation cannot be null");
		}
		if ("/".equals(operation) && operand2 == 0) {
			throw new IllegalOperationException("Division by zero is not allowed", new ArithmeticException());
		}
		if (operation.isBlank()) {
			throw new IllegalArgumentException("Operation cannot be empty");
		}
		if (!"+-*/".contains(operation))
			throw new IllegalOperationException(String.format("Operation '%s' does not exist", operation));
	}

}
