package problem2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Problem2 {

	public static void main(String[] args) {
		// ArrayList was chosen so that order could be shuffled, sorted, and be retrieved by index
		
		ArrayList<Integer> oneThruTen = new ArrayList<>();
		ArrayList<Integer> sixThruFifteen = new ArrayList<>();
		ArrayList<Integer> combinedNumbers = new ArrayList<>();

		for (int i = 1; i < 11; i++) {
			oneThruTen.add(i);
			sixThruFifteen.add(i + 5);
		}

		Collections.shuffle((List<?>) oneThruTen);
		Collections.shuffle((List<?>) sixThruFifteen);

		System.out.println("Collection 1:");
		for (Integer integer : oneThruTen) {
			System.out.println(integer);
		}
		System.out.println();
		
		System.out.println("Collection 2:");
		for (Integer integer : sixThruFifteen) {
			System.out.println(integer);
		}

		System.out.println();
		System.out.println("Collection 1 Size: " + oneThruTen.size());
		System.out.println("Collection 2 Size: " + sixThruFifteen.size());

		combinedNumbers.addAll(oneThruTen);
		combinedNumbers.addAll(sixThruFifteen);

		// Converting to Set and then reverting to ArrayList to remove duplicate
		Set<Integer> tempset = new HashSet<>();
		tempset.addAll(combinedNumbers);
		combinedNumbers.clear();
		combinedNumbers.addAll(tempset);
		//sort in ascending order
		combinedNumbers.sort(null);
		//remove middle value
		combinedNumbers.remove((combinedNumbers.size() / 2)); // only works if ArrayList size is odd.  Would need to check for
															  //if size is even or odd if size was unknown
		System.out.println("Third Collection in reverse order:");
		for (int i = (combinedNumbers.size() - 1); i > -1; i--) {

			System.out.println(combinedNumbers.get(i));
		}
	
		System.out.println("Third Collection size: " + combinedNumbers.size());

		// HashMap was chosen because order did not matter and HashMap has the
		// best performance of the Set types in Collection framework
		HashMap<String, String> hmap = new HashMap<>();
		hmap.putIfAbsent("Paul", "Pierce");
		hmap.putIfAbsent("Kevin", "Garnett");
		hmap.putIfAbsent("Ray", "Allen");
		hmap.putIfAbsent("Kendrick", "Perkins");
		hmap.putIfAbsent("Rajon", "Rondo");
		
		//Adding duplicate and printing out key,value pair
		if (hmap.containsKey("Paul")) {
			System.out.print("Duplicate Entry: " + "Paul ");
		}
		System.out.println(hmap.putIfAbsent("Paul", "Pierce")); 
																
		System.out.println("Key/Value Pairs " + hmap);
		System.out.println("Key/Value Collection size: " + hmap.size());

	}

}
