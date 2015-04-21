package soukoban;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Stage {
	
	private ArrayList<ArrayList<Character>> map;
	
	public Stage() {
		this.map = readMap();
	}
	
	public void setStage(int x, int y) {
		
	}
	
	public int[] getInitPlayerPosition() {
		int[] pPosition = new int[2];
		for (int i = 0; i < this.map.size(); i++) {
			for (int j = 0; j < this.map.get(i).size(); j++) {
				if (this.map.get(i).get(j) == 'p') {
					pPosition[0] = i;
					pPosition[1] = j;
					return pPosition;
				}
			}
		}
		return null;
	}
	
	private ArrayList<ArrayList<Character>> readMap() {
		try {
			BufferedReader br = new BufferedReader(new FileReader("/Users/utprot1/Documents/workspace/soukoban/src/soukoban/map.txt"));
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
	
	public void showMap() {
		for (int i = 0; i < map.size(); i++) {
			for (int j = 0; j < map.get(i).size(); j++) {
				System.out.print(map.get(i).get(j));		
			}
			System.out.println();
		}
	}
	
}
