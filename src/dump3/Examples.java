package dump3;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Examples {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub

		@SuppressWarnings("serial")
		Map<String, String> map = new HashMap<String, String>() {
			{
				put("hero", "action");
				put("batman", "joker");
				put("avengers", "thanos");
			}
		};

		Iterator<String> keys = map.keySet().iterator();
		Iterator<String> values = map.values().iterator();
		Collection<String> valuesC = map.values();
		Enumeration<String> enumKey = Collections.enumeration(valuesC);
		System.out.println(enumKey.hasMoreElements());
		while (enumKey.hasMoreElements()) {
			System.out.println(enumKey.nextElement());
		}
		String value = valuesC.stream().filter(v -> v.contains("joker")).findFirst().get();
		System.out.println(value);
		Set<Entry<String, String>> keyval = map.entrySet();

		while (keys.hasNext()) {
			System.out.println("key:::" + keys.next());
		}

		while (values.hasNext()) {
			System.out.println("value:::" + values.next());
		}

		keyval.forEach((k) -> System.out.println(k.getKey() + ":::" + k.getValue()));

		int[][] arr = { { 2, 3, 4 }, { 4, 5, 6 } };
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++)
				System.out.print(arr[i][j] + " ");
			System.out.println();
		}

		Class className = Class.forName("dump3.NewException1");
		Arrays.stream(className.getConstructors()).forEach(System.out::println);
		
	}

}
