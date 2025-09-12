package p6;

public class sumnumber {
	public static void main(String[] args) {

		int num = 12345;
		int sum = 0;
		int r;

		while (num > 0) {
			r = num % 10;
			sum = sum + r;
			num = num / 10;

		}
		
		System.out.println(sum);
	}

}
