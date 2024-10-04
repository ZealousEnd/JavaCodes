public class AnimalTest {
	public static void main(String[] args) {
		Animal[] animals = new Animal[5];

		animals[0] = new Bird();
		animals[1] = new Fish();
		animals[2] = new Snake();
		animals[3] = new Dog("Silly", 48.7, 70);
		animals[4] = new Terrier("Jack", 12.2, 12);

		for (Animal animal : animals) {
			animal.move();
		}
	}
}