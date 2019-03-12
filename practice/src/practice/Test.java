package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		List<Integer> list= new ArrayList<>();
		
		for (int i = 0; i < 20; i++) {
			list.add(0);
		}
		for (int i = 0; i < 10000; i++) {
			int r = rand.nextInt(20);
			Integer freq = list.get(r);
			list.set(r, freq + 1);
      
		}
		System.out.print(list);

	}

}
