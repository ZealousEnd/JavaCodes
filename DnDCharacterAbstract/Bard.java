import java.util.Random;
public class Bard extends DandDCharacter {
	public  Bard (String name, String features, String equipment, int proficiencyBonus, int hitPoints, int level, int health) {
		super(name, features, equipment, proficiencyBonus, hitPoints, level, health);
	}

	//changes the randomThrowHigh to represent the amount of sides the corresponding die would have required to determine Bard damage
	@Override
	public void attack(DandDCharacter other) {
		int randomThrowLow = 1 ;
		int randomThrowHigh = 8;
		Random rand = new Random();
		int totalAttack = hitPoints + proficiencyBonus + (rand.nextInt(randomThrowHigh));
		other.beingAttacked(totalAttack);
	}
}