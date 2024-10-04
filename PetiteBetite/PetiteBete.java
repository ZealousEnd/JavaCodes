/**
 *This class can be used to build objects type PetiteBete!
 *
 * @author Lorelei Alcazar
 */
public class PetiteBete {
	protected String name;
	protected int tolerance;
	protected int speed;
	protected int baseAttackPower;
	protected int levelOfMonster;
	
	/**
    *
    * @param name The name of the PetiteBete, often representing the type.
    * @param tolerance The health statitic of the PetiteBete.
    * @param speed The speed represents how fast the PetiteBete will move.
    * @param baseAttackPower It represents how much damage will be dealt to other PetiteBetes.
    * @param levelOfMonster The level is the amount of experience the pokemon holds.
	*/
	public PetiteBete(String name, int tolerance, int speed, int baseAttackPower, int levelOfMonster) {
		this.name = name;
		this.tolerance = tolerance;
		this.speed = speed;
		this.baseAttackPower = baseAttackPower;
		this.levelOfMonster = levelOfMonster;
	}

	/**
     *This method is for getting the name of the PetiteBete.
     * @return The name of the PetiteBete.
     */
	public String getName() {
		return this.name;
	}

	/**
     *This method is for getting the health of the PetiteBete.
     * @return The health of the PetiteBete.
     */
	public int getTolerance() {
		return this.tolerance;
	}

	/**
     *This method is for getting the speed of the PetiteBete.
     * @return The speed of the PetiteBete.
     */
	public int getSpeed() {
		return this.speed;
	}

	/**
     *This method is for getting the attack power of the PetiteBete.
     * @return The PetiteBete's attack power.
     */
	public int getAttackPower() {
		return this.baseAttackPower;
	}

	/**
     *This method is for getting the PetiteBete's level.
     * @return The level of the PetiteBete.
     */
	public int getLevelOfMonster() {
		return this.levelOfMonster;
	}

	

	/**
     *This method is for setting the PetiteBete's name.
     * @param name The name or type of the PetiteBete.
     * @return The PetiteBete's name.
     */
	public void setName(String name) {
		this.name = name;
	}

	/**
     *This method is for setting the PetiteBete's health.
     * @param tolerance The PetiteBete's health.
     * @return The health of the PetiteBete.
     */
	public void setTolerance(int tolerance) {
		this.tolerance = tolerance;
	}

	/**
     *This method is for setting the PetiteBete's speed.
     * @param speed The PetiteBete's speed.
     * @return The speed of the PetiteBete.
     */
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	/**
     *This method is for setting how much damage the current PetiteBete would do.
     * @param tolerance The PetiteBete's attack power statistic.
     */
	public void setAttackPower(int baseAttackPower) {
		this.baseAttackPower = baseAttackPower;
	}

	/**
     *This method is for setting the PetiteBete's experience level.
     * @param levelOfMonster The PetiteBete's experience level.
     */
	public void setLevelOfMonster(int levelOfMonster) {
		this.levelOfMonster = levelOfMonster;
	}

	/**
     *This method is for when one PetiteBete attacks another.
     * @param other The PetiteBete who is being attacked by the current PetiteBete.
     */
	public void attack(PetiteBete other) {
		other.beHit(baseAttackPower);
	}

	/**
     *This method is to be used when the PetiteBete gets attacked.
     * @param amountOfHit This is how much health the PetiteBete will loose due to the attack.
     */
	public void beHit(int amountOfHit) {
		tolerance = tolerance - amountOfHit;
			if (tolerance < 0) {
				tolerance = 0;
				System.out.println(name + " has fainted!");
			}


	}
	//This method will be used to print the state of the PetiteBete.
	@Override
	public String toString() {
		String returnVal = "";
		returnVal += "A PetiteBete called " + this.name + " that attacks at " + this.baseAttackPower;
		returnVal += " and has a speed of " + this.speed + " mph. It currently has a health of " + this.tolerance;
		returnVal += "HP and is " + this.levelOfMonster + " levels.";
		return returnVal;

	}
}