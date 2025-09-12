
//check number 153 is Armstrong
public class Armstrong {
	public static void main(String[] args) {

		int num = 153;
		int temp = num;
		int sum = 0;
		int digit = Integer.toString(temp).length();

		while (temp > 0) {

			int rem = temp % 10;
			sum += Math.pow(rem, digit);
			temp = temp / 10;

		}
		if(sum==num) {
			System.out.println("Armstrong");
			
			
		}else {
			
			System.out.println("not");
		}

	}

}