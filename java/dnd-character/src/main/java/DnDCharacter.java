import java.util.Comparator;
import java.util.List;
import java.util.Random;

class DnDCharacter {

	int ability(List<Integer> scores) {
		return scores.stream()
				.sorted(Comparator.reverseOrder())
				.limit(3)
				.reduce(0, Integer::sum);
	}

	List<Integer> rollDice() {
		return new Random().ints(4, 1, 7)
				.boxed()
				.toList();
	}

	int modifier(int input) {
		return (int) Math.floor((input - 10) / 2.0);
	}

	int getStrength() {
		throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
	}

	int getDexterity() {
		throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
	}

	int getConstitution() {
		throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
	}

	int getIntelligence() {
		throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
	}

	int getWisdom() {
		throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
	}

	int getCharisma() {
		throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
	}

	int getHitpoints() {
		throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
	}
}
