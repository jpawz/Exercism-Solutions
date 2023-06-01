class Darts {
	int score(double xOfDart, double yOfDart) {
		double hit = Math.sqrt(xOfDart * xOfDart + yOfDart * yOfDart);
		if (hit <= 10 && hit > 5)
			return 1;
		if (hit <= 5 && hit > 1)
			return 5;
		if (hit <= 1)
			return 10;

		return 0;
	}
}
