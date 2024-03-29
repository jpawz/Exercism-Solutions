import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

public class DnDCharacterTest {

	private DnDCharacter dndCharacter = new DnDCharacter();

	@Test
	public void testAbilityModifierForScore3IsNegative4() {
		assertEquals(-4, dndCharacter.modifier(3));
	}

	@Test
	public void testAbilityModifierForScore4IsNegative3() {
		assertEquals(-3, dndCharacter.modifier(4));
	}

	@Test
	public void testAbilityModifierForScore5IsNegative3() {
		assertEquals(-3, dndCharacter.modifier(5));
	}

	@Test
	public void testAbilityModifierForScore6IsNegative2() {
		assertEquals(-2, dndCharacter.modifier(6));
	}

	@Test
	public void testAbilityModifierForScore7IsNegative2() {
		assertEquals(-2, dndCharacter.modifier(7));
	}

	@Test
	public void testAbilityModifierForScore8IsNegative1() {
		assertEquals(-1, dndCharacter.modifier(8));
	}

	@Test
	public void testAbilityModifierForScore9IsNegative1() {
		assertEquals(-1, dndCharacter.modifier(9));
	}

	@Test
	public void testAbilityModifierForScore10Is0() {
		assertEquals(0, dndCharacter.modifier(10));
	}

	@Test
	public void testAbilityModifierForScore11Is0() {
		assertEquals(0, dndCharacter.modifier(11));
	}

	@Test
	public void testAbilityModifierForScore12Is1() {
		assertEquals(1, dndCharacter.modifier(12));
	}

	@Test
	public void testAbilityModifierForScore13Is1() {
		assertEquals(1, dndCharacter.modifier(13));
	}

	@Test
	public void testAbilityModifierForScore14Is2() {
		assertEquals(2, dndCharacter.modifier(14));
	}

	@Test
	public void testAbilityModifierForScore15Is2() {
		assertEquals(2, dndCharacter.modifier(15));
	}

	@Test
	public void testAbilityModifierForScore16Is3() {
		assertEquals(3, dndCharacter.modifier(16));
	}

	@Test
	public void testAbilityModifierForScore17Is3() {
		assertEquals(3, dndCharacter.modifier(17));
	}

	@Test
	public void testAbilityModifierForScore18Is4() {
		assertEquals(4, dndCharacter.modifier(18));
	}

	@Test
	public void test4DiceWereUsedForRollingScores() {
		assertEquals(4, dndCharacter.rollDice()
				.size());
	}

	@Test
	public void testDiceValuesBetween1And6() {
		assertTrue(dndCharacter.rollDice()
				.stream()
				.allMatch(d -> d >= 1 && d <= 6));
	}

	@Test
	public void testAbilityCalculationsUses3LargestNumbersFromScoresInDescendingOrder() {
		assertEquals(9, dndCharacter.ability(List.of(4, 3, 2, 1)));
	}

	@Test
	public void testAbilityCalculationsUses3LargestNumbersFromFromScoresInAscendingOrder() {
		assertEquals(9, dndCharacter.ability(List.of(1, 2, 3, 4)));
	}

	@Test
	public void testAbilityCalculationsUses3LargestNumbersFromScoresInRandomOrder() {
		assertEquals(9, dndCharacter.ability(List.of(2, 4, 3, 1)));
	}

	@Test
	public void testAbilityCalculationsWithLowestEqualNumbers() {
		assertEquals(3, dndCharacter.ability(List.of(1, 1, 1, 1)));
	}

	@Test
	public void testAbilityCalculationsWithHighestEqualNumbers() {
		assertEquals(18, dndCharacter.ability(List.of(6, 6, 6, 6)));
	}

	@Test
	public void testAbilityCalculationDoesNotChangeInputScores() {
		List<Integer> scores = List.of(1, 2, 3, 4);
		dndCharacter.ability(scores);

		assertEquals(4, scores.size());
		assertEquals(scores, List.of(1, 2, 3, 4));
	}

	@Test
	public void testRandomCharacterIsValid() {
		for (int i = 0; i < 1000; i++) {
			DnDCharacter character = new DnDCharacter();
			assertTrue(character.getStrength() > 2 && character.getStrength() < 19);
			assertTrue(character.getDexterity() > 2 && character.getDexterity() < 19);
			assertTrue(character.getConstitution() > 2 && character.getConstitution() < 19);
			assertTrue(character.getIntelligence() > 2 && character.getIntelligence() < 19);
			assertTrue(character.getWisdom() > 2 && character.getWisdom() < 19);
			assertTrue(character.getCharisma() > 2 && character.getCharisma() < 19);
			assertEquals(10 + character.modifier(character.getConstitution()), character.getHitpoints());
		}
	}

	@Test
	public void testEachAbilityIsOnlyCalculatedOnce() {
		assertEquals(dndCharacter.getStrength(), dndCharacter.getStrength());
	}

	@Test
	public void testUniqueCharacterIsCreated() {
		DnDCharacter uniqueDnDCharacter = new DnDCharacter();
		for (int i = 0; i < 1000; i++) {
			DnDCharacter dnDCharacter = new DnDCharacter();
			boolean dnDCharactersHaveDifferentAttributes = dnDCharacter.getStrength() != uniqueDnDCharacter
					.getStrength()
					|| dnDCharacter.getDexterity() != uniqueDnDCharacter.getDexterity()
					|| dnDCharacter.getConstitution() != uniqueDnDCharacter.getConstitution()
					|| dnDCharacter.getIntelligence() != uniqueDnDCharacter.getIntelligence()
					|| dnDCharacter.getWisdom() != uniqueDnDCharacter.getWisdom()
					|| dnDCharacter.getCharisma() != uniqueDnDCharacter.getCharisma()
					|| dnDCharacter.getHitpoints() != uniqueDnDCharacter.getHitpoints();
			assertTrue(dnDCharactersHaveDifferentAttributes);
		}
	}
}
