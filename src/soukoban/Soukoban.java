package soukoban;

import java.util.ArrayList;

public class Soukoban {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Soukoban sb = new Soukoban();
		
		startGame();
	}
	
	private static void startGame() {
		
		Stage stage = new Stage();
		Player player = new Player(stage.getPlayerPosition().get(0), stage.getPlayerPosition().get(1));
		stage.setPlayerPosition(player, 2, 2);
//		int x = stage.getCargoPosition().get(2).get(0);
//		int y = stage.getCargoPosition().get(2).get(1);
//		Cargo cargo = new Cargo(x, y);
		ArrayList<ArrayList<Integer>> cargo = stage.getCargoPosition();
		ArrayList<Cargo> cargos = new ArrayList<Cargo>();
		
		for (ArrayList<Integer> c : cargo) {
			cargos.add(new Cargo(c.get(0), c.get(1)));
		}
		System.out.println(cargo);
		stage.showMap();
		//System.out.println(x + " " + y );
				
	}
	
}