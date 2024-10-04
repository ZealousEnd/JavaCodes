/**
 *This class builds objects of type PetiteBete and tests their methods.
 *
 * @author Lorelei Alcazar
 */
public class Main {
	
	public static void main(String[] args) {
		//this builds a few PetiteBetes and passes their statistics into them.
		PetiteBete growlithe = new PetiteBete("Growlithe", 55, 70, 71, 9);
		PetiteBete luxio = new PetiteBete("Luxio", 60, 60, 85, 13 );
		PetiteBete turtwig = new PetiteBete("Turtwig", 55, 45, 68, 10);
		PetiteBete gastly = new PetiteBete("Gastly", 30, 100, 35, 15);

		//Just building an array of PetiteBete's
		PetiteBete[] arrayOfBetes  = new PetiteBete[4];
			arrayOfBetes[0] = growlithe;
			arrayOfBetes[1] = luxio;
			arrayOfBetes[2] = turtwig;
			arrayOfBetes[3] = gastly;

		//This will itterate through each PetiteBete built and print their stats.
		for (PetiteBete p : arrayOfBetes) {
					System.out.println(p);
				}

		//This is just to test the battle system
		System.out.println("Go get em Gastly!");
		gastly.attack(luxio);
		System.out.println(luxio.getTolerance());

		System.out.println("Go get em Luxio!");
		luxio.attack(gastly);
		System.out.println(gastly.getTolerance());

		}
}