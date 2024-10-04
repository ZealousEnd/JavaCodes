public class Terrier extends Dog {
	public Terrier (String name, double height, double weight) {
		super(name, height, weight);
	}

	@Override
	public void speak() {
		System.out.println("Woowoowoowoowoo");
	}

	@Override
	public void move() {
		System.out.println("Im a terrier that's moving");
	}

	public void actPsycho() {
		System.out.println("Who do they think they are? I've given the best years of my life to this place and they think they can just fire me like that? Like TRASH? I don't think so... (The terrier is acting psycho");
	}
}