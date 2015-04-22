package soukoban;

<<<<<<< HEAD
import java.util.ArrayList;

=======
>>>>>>> d124c044b717d70f78150a84721d61b73e0b22a4
public class Soukoban {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
<<<<<<< HEAD
		
		Soukoban sb = new Soukoban();
		
=======

>>>>>>> d124c044b717d70f78150a84721d61b73e0b22a4
		startGame();
	}
	
	private static void startGame() {
		
		Stage stage = new Stage();
<<<<<<< HEAD
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
=======
		stage.showMap();
		
		Player player = new Player(stage.getInitPlayerPosition()[1], stage.getInitPlayerPosition()[0]);
		
		player.setPosition(4, 6);
		
		
	}

}
>>>>>>> d124c044b717d70f78150a84721d61b73e0b22a4
