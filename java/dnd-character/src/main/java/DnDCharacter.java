import java.util.Comparator;
import java.util.List;
import java.util.Random;

class DnDCharacter {

	private final int strength;
	private final int dexterity;
	private final int constitution;
	private final int intelligence;
	private final int wisdom;
	private final int charisma;
	private final int hitpoints;

	public DnDCharacter() {
		strength = ability(rollDice());
		dexterity = ability(rollDice());
		constitution = ability(rollDice());
		intelligence = ability(rollDice());
		wisdom = ability(rollDice());
		charisma = ability(rollDice());
		hitpoints = 10 + modifier(constitution);
	}

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
		return strength;
	}

	int getDexterity() {
		return dexterity;
	}

	int getConstitution() {
		return constitution;
	}

	int getIntelligence() {
		return intelligence;
	}

	int getWisdom() {
		return wisdom;
	}

	int getCharisma() {
		return charisma;
	}

	int getHitpoints() {
		return hitpoints;
	}
}
