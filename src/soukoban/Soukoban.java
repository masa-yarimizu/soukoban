package soukoban;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Soukoban {

	public static void main(String[] args) {
		
		Soukoban sb = new Soukoban();
		
		startGame();
	}
	
	private static void startGame() {
		
		Stage stage = new Stage();
		/*プレイヤー初期化*/
		Player player = new Player(stage.getPlayerPosition().get(0), stage.getPlayerPosition().get(1));
//		stage.setPlayerPosition(player, 2, 2);
//		int x = stage.getCargoPosition().get(2).get(0);
//		int y = stage.getCargoPosition().get(2).get(1);
//		Cargo cargo = new Cargo(x, y);
		/*荷物を初期化し配列にまとめる*/
		ArrayList<ArrayList<Integer>> cargo = stage.getCargoPosition();
		ArrayList<Cargo> cargos = new ArrayList<Cargo>();
		for (ArrayList<Integer> c : cargo) {
			cargos.add(new Cargo(c.get(0), c.get(1)));
		}
		
		System.out.println(cargos);
		stage.showMap();
		//System.out.println(x + " " + y );
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			char input = br.readLine().charAt(0);
			
			if (input == 's') {
				stage.setPlayerPosition(player, player.getX(), player.getY() + 1);
				stage.showMap();
			} 
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
