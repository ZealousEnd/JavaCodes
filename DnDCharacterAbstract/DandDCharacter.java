/**
 *This class can be used to build objects type Character!
 *
 * @author Lorelei Alcazar
 */
import java.util.Random;
public class DandDCharacter {
	protected String name;
	protected String features;
	protected String equipment;
	protected int proficiencyBonus;
	protected int hitPoints;
	protected int level;
	protected int health;
	
	/**
    *
    * @param name The name of the Character
    * @param features The features are the playable moves of the characters
    * @param equipment The items the character carries.
    * @param proficiencyBonus The proficiency bonus is the bonus power amount delt per move.
    * @param hitPoints It represents how much damage will be dealt to other characters.
    * @param level The level is the amount of experience the character holds.
    * @param health The health of the character.
	*/
	public DandDCharacter(String name, String features, String equipment, int proficiencyBonus, int hitPoints, int level, int health) {
		this.name = name;
		this.proficiencyBonus = proficiencyBonus;
		this.features = features;
		this.hitPoints = hitPoints;
		this.level = level;
		this.equipment = equipment;
		this.health = health;
	}

	/**
     *This method is for getting the name of the Character.
     * @return The name of the Character.
     */
	public String getName() {
		System.out.println(name);
		return this.name;
	}

	/**
     *This method is for getting the proficiency bonus of the character.
     * @return The proficiencyBonus of the character.
     */
	public int getproficiencyBonus() {
		return this.proficiencyBonus;
	}

	/**
     *This method is for getting the moves of the characters.
     * @return The moves of the Character.
     */
	public String getFeatures() {
		return this.features;
	}

	/**
     *This method is for getting the attack power of the Character.
     * @return The Character's attack power.
     */
	public int getHitPoints() {
		return this.hitPoints;
	}

	/**
     *This method is for getting the Character's level.
     * @return The level of the Character.
     */
	public int getlevel() {
		return this.level;
	}

	/**
     *This method is for getting the Character's health.
     * @return The health of the Character.
     */
	public int gethealth() {
		return this.health;
	}

	

	/**
     *This method is for setting the Character's name.
     * @param name The name or type of the Character.
     * @return The Character's name.
     */
	public void setName(String name) {
		this.name = name;
	}

	/**
     *This method is for setting the Character's bonus power for moves.
     * @param proficiencyBonus The Character's profiecieny bonus.
     * @return The profiency bonus of the character.
     */
	public void setproficiencyBonus(int proficiencyBonus) {
		this.proficiencyBonus = proficiencyBonus;
	}
	
	/**
     *This method is for setting the Character's moves.
     * @param features The Character's moves aka features.
     * @return The features of the Character.
     */
	public void setFeatures(String features) {
		this.features = features;
	}

	/**
     *This method is for setting how much damage the current Character would do.
     * @param proficiencyBonus The Character's attack power statistic.
     */
	public void setHitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}

	/**
     *This method is for setting the Character's experience level.
     * @param level The Character's experience level.
     */
	public void setlevel(int level) {
		this.level = level;
	}

	/**
     *This method is for setting the Character's health.
     * @param level The Character's experience level.
     */
	public void setHealth(int health) {
		this.health = health;
	}

	/**
     *This method is for when one Character attacks another.
     * @param other The other character who is being attacked by the current one.
     */
	public void attack(DandDCharacter other) {
		int randomThrowLow = 1 ;
		int randomThrowHigh = 4;
		Random rand = new Random();
		int totalAttack = hitPoints + proficiencyBonus + (rand.nextInt(randomThrowHigh));
		other.beingAttacked(totalAttack);
	}

	/**
     *This method is to be used when the Character gets attacked.
     * @param amountOfHit This is how much health the Character will loose due to the attack.
     */
	public void beingAttacked(int amountOfHit) {
		health = health - amountOfHit;
			if (health < 0) {
				health = 0;
				System.out.println(name + " has " + health);
			}
		}
}