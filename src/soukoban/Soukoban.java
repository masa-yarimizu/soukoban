package soukoban;

public class Soukoban {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		startGame();
	}
	
	private static void startGame() {
		
		Stage stage = new Stage();
		stage.showMap();
		
		Player player = new Player(stage.getInitPlayerPosition()[1], stage.getInitPlayerPosition()[0]);
		
		player.setPosition(4, 6);
		
		
	}

}
