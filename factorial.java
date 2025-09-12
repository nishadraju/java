import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();

		int i = 1;
		int factorial = 1;

		while (i <= num) {
			factorial *= i;
			i++;

		}
		System.out.println(factorial);

	}
}
