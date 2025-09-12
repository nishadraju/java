package String;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;

public class Count_Occurrence {
	public static void main(String[] args) {

		String input = "javajavaEE";

		Map<Character, Integer> countDuplicateMap = new HashMap();

		char[] charArray = input.toCharArray();

		for (char c : charArray) {

			if (countDuplicateMap.containsKey(c)) {

				countDuplicateMap.put(c, countDuplicateMap.get(c) + 1);

			} else {

				countDuplicateMap.put(c, 1);
			}

		}

		for (java.util.Map.Entry<Character, Integer> entry : countDuplicateMap.entrySet()) {

			if (entry.getValue() > 1) {

				System.out.println(entry.getKey() + ":" + entry.getValue());
			}

		}

	}
}