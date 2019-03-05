package practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class homework {

	public static void main(String[] args) {
		List<String> morningcall = new ArrayList<>();
		morningcall.add("wake up!");
		morningcall.add("It's time for breakfast now.");
		morningcall.add("Good morning.");
		morningcall.add("wake up!");
		morningcall.add("wake up!");
		System.out.print(morningcall);
		
		Set<Integer> busseat = new HashSet<>();
		busseat.add(1);
		busseat.add(15);
		busseat.add(15);
		busseat.add(9);
		busseat.add(7);
		System.out.print(busseat);

	}

}
