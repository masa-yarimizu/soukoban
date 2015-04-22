package soukoban;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Stage {
	
	private ArrayList<ArrayList<Character>> map;
	
<<<<<<< HEAD
	/**
	 * コンストラクタ
	 */
=======
>>>>>>> d124c044b717d70f78150a84721d61b73e0b22a4
	public Stage() {
		this.map = readMap();
	}
	
	public void setStage(int x, int y) {
		
	}
	
<<<<<<< HEAD
	/**
	 * プレイヤーの位置を取得するメソッド
	 * 
	 * @return　プレイヤーのx座標とy座標を格納したArrayList
	 * {x座標, y座標}として格納されている。
	 */
	public ArrayList<Integer> getPlayerPosition() {
		ArrayList<Integer> pPosition = new ArrayList<Integer>();
		for (int i = 0; i < this.map.size(); i++) {
			for (int j = 0; j < this.map.get(i).size(); j++) {
				if (this.map.get(i).get(j) == 'p') {
					pPosition.add(j);
					pPosition.add(i);
=======
	public int[] getInitPlayerPosition() {
		int[] pPosition = new int[2];
		for (int i = 0; i < this.map.size(); i++) {
			for (int j = 0; j < this.map.get(i).size(); j++) {
				if (this.map.get(i).get(j) == 'p') {
					pPosition[0] = i;
					pPosition[1] = j;
>>>>>>> d124c044b717d70f78150a84721d61b73e0b22a4
					return pPosition;
				}
			}
		}
		return null;
	}
	
<<<<<<< HEAD
	/**
	 * マップファイルを読み込むメソッド
	 * @return マップをchar型の2次元配列に格納したもの
	 */
	private ArrayList<ArrayList<Character>> readMap() {
		try {
			BufferedReader br = new BufferedReader(new FileReader("resources/map.txt"));
=======
	private ArrayList<ArrayList<Character>> readMap() {
		try {
			BufferedReader br = new BufferedReader(new FileReader("/Users/utprot1/Documents/workspace/soukoban/src/soukoban/map.txt"));
>>>>>>> d124c044b717d70f78150a84721d61b73e0b22a4
			ArrayList<ArrayList<Character>> map = new ArrayList<ArrayList<Character>>();
			String line;
			while ((line = br.readLine()) != null) {
				ArrayList<Character> node = new ArrayList<Character>();
				
				for (int i = 0; i < line.length(); i++) {				
					node.add(line.charAt(i));
					//System.out.println(node);
				}
				map.add(node);
				//System.out.println(map);
			}
			return map;
			
		} catch (IOException e) {
			System.out.println(e);
			return null;
		}
	}
	
<<<<<<< HEAD
	/**
	 * 荷物のx座標とy座標を取得するメソッド
	 * @return　荷物の位置をArrrayList<ArrayList<Integer>>で返す
	 * ArrayList<Integer>には{x座標、y座標}のじゅんで入っている
	 */
	public ArrayList<ArrayList<Integer>> getCargoPosition() {
		ArrayList<ArrayList<Integer>> Cargo = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < this.map.size(); i++) {			
			for (int j = 0; j < this.map.get(i).size(); j++) {
				ArrayList<Integer> pCargo = new ArrayList<Integer>();
				if (this.map.get(i).get(j) == 'o') {
					pCargo.add(j);
					pCargo.add(i);
					Cargo.add(pCargo);
				}
			}
		}
		return Cargo;
	}
	
	/**
	 * プレイヤーの位置を移動させるメソッド。移動する前の位置は' 'に置換される。
	 * @param p　Playerクラスのインスタンス
	 * @param x　Playerを移動させたいx座標
	 * @param y　Playerを移動させたいy座標
	 */
	public void setPlayerPosition(Player p, int x, int y) {
		this.map.get(p.getY()).set(p.getX(), ' ');
		this.map.get(y).set(x, 'p');
	}
	
	/**
	 * 荷物の位置を移動させるメソッド。移動する前の位置は' 'に置換される。
	 * @param c　Cargoクラスのインスタンス
	 * @param x　Cargoを移動させたいx座標
	 * @param y　cargoを移動させたいy座標
	 */
	public void setCargoPosition(Cargo c, int x, int y) {
		this.map.get(c.getY()).set(c.getX(), ' ');
		this.map.get(y).set(x, 'o');
	}
	
	/**
	 * マップを表示するメソッド
	 */
	public void showMap() {
		for (int i = 0; i < this.map.size(); i++) {
			for (int j = 0; j < this.map.get(i).size(); j++) {
				System.out.print(this.map.get(i).get(j));		
=======
	public void showMap() {
		for (int i = 0; i < map.size(); i++) {
			for (int j = 0; j < map.get(i).size(); j++) {
				System.out.print(map.get(i).get(j));		
>>>>>>> d124c044b717d70f78150a84721d61b73e0b22a4
			}
			System.out.println();
		}
	}
	
<<<<<<< HEAD
}
=======
}
>>>>>>> d124c044b717d70f78150a84721d61b73e0b22a4
