public class Game {
	public static void main(String[] args) {
	start();
	while (gameOver == false) {
	update();
	render();
		}
	}

	public static void render() {
	Scene.draw();   //draw scene
	Enemy.draw();   //draw enemy
	Player.draw();  //draw player
	StdDraw.text(64, 32, "Score: " + score);
	StdDraw.show(100); 
	}

	public static void update() {
	//check for input
	Player.update(); //update player
	Enemy.update(); //update enemy
	}

	public static void start() {
	//setup all game data
	Scene.start();
	Enemy.start();
	Player.start();
	}

	private static boolean gameOver = false;
	private static int score = 0;
	public static void addScore() {
		score++;
	}
}