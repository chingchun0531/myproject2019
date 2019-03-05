package practice;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListandSet {
	public static void main(String[] args){	
		List<Integer> bag = new ArrayList<>();
		bag.add(2);
		bag.add(2);
		bag.add(98);
		bag.add(75);
		System.out.print(bag);
		Set<Integer> piece = new HashSet<>();
		piece.add(7);
		piece.add(7);
		piece.add(12);
		piece.add(98);
		System.out.print(piece);
		
		
	}

}
