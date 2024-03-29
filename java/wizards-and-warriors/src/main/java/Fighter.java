abstract class Fighter {

	boolean isVulnerable() {
		return false;
	}

	abstract int damagePoints(Fighter fighter);

	@Override
	public String toString() {
		return "Fighter is a " + this.getClass()
				.getSimpleName();
	}

}

class Warrior extends Fighter {

	@Override
	int damagePoints(Fighter wizard) {
		return wizard.isVulnerable() ? 10 : 6;
	}
}

class Wizard extends Fighter {

	private boolean isPreparedSpell = false;

	@Override
	boolean isVulnerable() {
		return !isPreparedSpell;
	}

	@Override
	int damagePoints(Fighter warrior) {
		return isPreparedSpell ? 12 : 3;
	}

	void prepareSpell() {
		isPreparedSpell = true;
	}

}
