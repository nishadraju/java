package Practice1_String;

public class count_character {
	public static void main(String[] args) {

		String name = "raju";

		int count = 0;

		for (int i = 0; i < name.length(); i++) {

			if (name.charAt(i) != ' ') {

				count++;

			}

		}
		System.out.println(count);
	}

}
