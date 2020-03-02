package edu.smith.cs.csc212.adtr;

import edu.smith.cs.csc212.adtr.real.JavaMap;
import edu.smith.cs.csc212.adtr.real.JavaSet;

// Wow, this class really needs some comments...
public class Challenges {

	public static SetADT<String> union(SetADT<String> left, SetADT<String> right) {

		SetADT<String> output = new JavaSet<>();

		for(String leftItem: left) {
			output.insert(leftItem);	
		}

		for(String rightItem: right) {
			output.insert(rightItem);
		}

		return output;
	}

	public static SetADT<String> intersection(SetADT<String> left, SetADT<String> right) {
		SetADT<String> output = new JavaSet<>();

		for(String leftItem: left) {

			if(right.contains(leftItem)){
				output.insert(leftItem);	
			}
		}

		return output;
	}

	public static MapADT<String, Integer> wordCount(ListADT<String> words) {
		MapADT<String, Integer> output = new JavaMap<>();

		for(String wc: words) {
			if(output.get(wc) == null) {
				output.put(wc, 1);
			} else {

				output.put(wc, output.get(wc)+1);

			}
		}
		return output;

	}
}
