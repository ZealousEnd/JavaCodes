/**
 *This class can be used to build objects type Character!
 *
 * @author Lorelei Alcazar
 */
public class DandDCharacterTest {
	public static void main(String[] args) {
		DandDCharacter[] characters = new DandDCharacter[4];

		//builds objects, each of different type, for the characters array in order to use it to get their names.
		characters[0] = new DandDCharacter("Bojack", "Does nothing", "jokes", 1, 25, 0, 50);
		characters[1] = new Barbarian("Eric", "Rage, Reckless Attack", "Great axe", 2, 7, 2, 50);
		characters[2] = new Bard("Raine", "Song of Rest, Spell Casting", "A violin, A longsword", 2, 8, 1, 50);
		characters[3] = new Cleric("Odin", "Channel Divinity, Divine Domain", "A warhammer, A Mace", 2, 5, 3, 50);

		//this iterates through each class type and says their names
		for (DandDCharacter character : characters) {
			character.getName();
		}
	}
}