import java.util.Scanner;

public class Count_Vowel_Consonant {

	public static void main(String[] args) {

		String s;
		int i, vol = 0, con = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string ----->");
		s = sc.nextLine();
		s = s.toUpperCase();

		for (i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c >= 'A' && c <= 'Z') { // केवल अक्षर ही गिने जाएंगे
				if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
					vol++;
				} else {
					con++;
				}
			}
		}

		System.out.println("Number of vowels: " + vol);
		System.out.println("Number of consonants: " + con);

		sc.close(); // Scanner को बंद करना अच्छा अभ्यास है
	}
}
