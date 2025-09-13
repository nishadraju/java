package Practice1;
import java.util.Scanner;
public class fabonacic {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number--->");
		int num = sc.nextInt();

		int x = 0;
		int y = 1;
		int z = 0;

		while (z <= num) {

			x = y;
			y = z;
			z = x + z;
			System.out.println(z);
		}
	}

}
