public class DodgerGame {
	private Scene scene;
	private boolean isOver;
	private long startTime;
	private Controller controller;
	private int timer;


/*Create a new Dodger Game*/
public DodgerGame() {
	isOver = false;
	scene = new Scene();
	startTime = System.currentTimeMillis();
	Player player = new Player (250, 187.5);
	this.scene.setPlayer(player);
	controller = new Controller ( player );
	this.timer = 0;
	
}

public void update() {
	controller.update();
	long now = System.currentTimeMillis();
	if (now - this.startTime > 200 ) {
	scene.addMonster();
	this.timer++;
	this.startTime = now;
	}
	scene.update();
	Player player = scene.getPlayer();
 	for (Enemy monster : scene.getMonsters() ) {
 		if ( player.isTouching(monster) ) {
 			isOver = true;
 }
 }
	//game update code
}

public void render() {
	scene.draw();
	StdDraw.setPenColor(StdDraw.WHITE);
	StdDraw.text(64,32,"Time: " + timer/5 );
	StdDraw.show(100);

	//game draw code
}

/* The main game loop*/
public static void main(String[] args) {
	DodgerGame game = new DodgerGame();
	while (game.isOver == false) {
	game.update();
	game.render();
	}
}
}