import java.util.Comparator;
import java.util.List;
import java.util.Random;

class DnDCharacter {

	private Integer strength;
	private Integer dexterity;
	private Integer constitution;
	private Integer intelligence;
	private Integer wisdom;
	private Integer charisma;
	private Integer hitpoints;

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
		return strength == null ? strength = ability(rollDice()) : strength;
	}

	int getDexterity() {
		return dexterity == null ? dexterity = ability(rollDice()) : dexterity;
	}

	int getConstitution() {
		return constitution == null ? constitution = ability(rollDice()) : constitution;
	}

	int getIntelligence() {
		return intelligence == null ? intelligence = ability(rollDice()) : intelligence;
	}

	int getWisdom() {
		return wisdom == null ? wisdom = ability(rollDice()) : wisdom;
	}

	int getCharisma() {
		return charisma == null ? charisma = ability(rollDice()) : charisma;
	}

	int getHitpoints() {
		return hitpoints == null ? hitpoints = 10 + modifier(getConstitution()) : hitpoints;
	}
}
