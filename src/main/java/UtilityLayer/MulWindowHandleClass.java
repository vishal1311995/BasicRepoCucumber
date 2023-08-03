package UtilityLayer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import BaseLayer.BaseClass;

public class MulWindowHandleClass extends BaseClass{

	public static String handleTwoWindows(Set<String> bothWins, String parentID) {
		for (String web: bothWins) {
			if(!web.equals(parentID)) {
				return web;
			}
		}
		return null;
	}
	public static String handleThreeWindows(Set<String> allWins, String parentID, String secondID) {
		for (String web: allWins) {
			if((web!= parentID && web!= secondID)) {
				return web;
			}
		}
		return null;
	}
	public static ArrayList<String> handleMultipleWins(Set<String> allWins){
		ArrayList<String> arr = new ArrayList<String>(allWins);
		return arr;
	}
	public static ArrayList<String> handleMulWinsWithIterator(Set<String> allwins){
		ArrayList<String> arr = new ArrayList<String>();
		Iterator<String> it  = allwins.iterator();
		while(it.hasNext()) {
			arr.add(it.next());
		}
		return arr;
		
	}
}
