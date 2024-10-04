public class Player {
	//player data
	private static String image;
	private static int width;
	private static int height;
	private	static double x;
	private static double y;

	public static void start() {
		image = "assests/aimer.png";
		width = 32;
		height = 32;
		x = Scene.getWidth()/2;
		y = Scene.getHeight()/2;
	}

	public static void draw() {
		Std.Draw.picture(x+width/2, y+height/2, image);
	}

	public static void move() {
		x = StdDraw.mouseX() - width/2;
		y = StdDraw.mouseY() - height/2;
	}

	public static void update() {
		move();
	}

	public static double getLeft() {
		return x;
	}

	public static double getTop() {
		return y;
	}
	public static double getBottom() {
		return y + height;
	}
	public static double getRight(){
		return x + width;
	}
}