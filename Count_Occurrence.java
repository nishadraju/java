package Practice1_String;

public class count_Occurance {
	public static void main(String[] args) {

		String input = "javajavaee";

		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			int count = 0;

			for (int j = 0; j < input.length(); j++) {
				if (c == input.charAt(j)) {
					count++;

				}

			}
			if (input.indexOf(c) == i) {
				System.out.println(c + ":" + count);

			}

		}
	}

}

	
