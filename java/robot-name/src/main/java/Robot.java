import java.util.Random;

class Robot {
    private static final int capitalACode = 65;
    private static final int capitalZCode = 90;
    private static final int targetStringLength = 2;
    private static final Random random = new Random();

    private String name;

    Robot() {

	name = generateName();
    }

    private String generateName() {
	String prefix = random.ints(capitalACode, capitalZCode + 1).limit(targetStringLength)
			      .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
			      .toString();
	int suffix = random.nextInt(100, 999);
	return prefix + suffix;
    }

    String getName() {
	return name;
    }

    void reset() {
	name = generateName();
    }
}