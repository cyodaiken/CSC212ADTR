package edu.smith.cs.csc212.adtr;

import edu.smith.cs.csc212.adtr.real.JavaMap;
import edu.smith.cs.csc212.adtr.real.JavaSet;

/**
 * Created as practice to understand sets and maps in Java.
 * @author 
 *
 */

public class Challenges {

	/**
	 * 
	 * @param left- one of the Set used for the union
	 * @param right - the other Set used for the union
	 * @return - the resulting set after the union
	 */
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

	/**
	 * This finds the intersection of two sets
	 * @param left - one of the Set used for the intersection 
	 * @param right - the other Set used for the intersection
	 * @return - the resulting set after the intersection
	 */
	public static SetADT<String> intersection(SetADT<String> left, SetADT<String> right) {
		SetADT<String> output = new JavaSet<>();

		for(String leftItem: left) {

			if(right.contains(leftItem)){
				output.insert(leftItem);	
			}
		}

		return output;
	}

	/**
	 * This finds the word count for a list
	 * @param words - the List of 'words' that need to be counted 
	 * @return - resulting map of the words and their counts
	 */
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
