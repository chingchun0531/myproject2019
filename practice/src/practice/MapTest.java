package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MapTest {

	public static void main(String[] args) {
		Random rand = new Random(47);
		Map<Integer, Integer> m = new HashMap<>();
		for (int i = 0; i < 1000; i++) {
			int r = rand.nextInt(20);
			Integer value = m.get(r);
			if (value == null) {
				value = 1;
			} else {
				value = value + 1;
			}
			m.put(r, value);

		}
		System.out.println(m);
	}
}
