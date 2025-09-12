
public class Reverse_number {

	public static void main(String[] args) {

		int n = 12345;

		int r;

		while (n > 0) {

			r = n % 10;
			n = n / 10;

			System.out.print(r);

		}

	}

}
