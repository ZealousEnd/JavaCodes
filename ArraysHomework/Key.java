public class Key {
	public static final int TILE_SIZE = 32;
	public static int x;
	public static int y;
	private static String image;

	public static void start(int x, int y) {
		Key.x = x;
		Key.y = y;
		image = "Assets/key.png";
	}

	public static void draw() {
		if (Player.hasKey == false) {
	int tileX = x * TILE_SIZE + TILE_SIZE/2;
	int tileY = y * TILE_SIZE + TILE_SIZE/2;
	StdDraw.picture(tileX, tileY, image);
	} }

	public static int getX() {
		if (MazeGame.level == 0) {
			Key.x = 5;
		}
		else if (MazeGame.level == 1) {
			Key.x = 14;
		}
		return x;
	}

	public static int getY() {
		if (MazeGame.level == 0) {
			Key.y = 4;
		}
		else if (MazeGame.level ==1) {
			Key.y = 9 ;
		}

		return y;
	}
}
