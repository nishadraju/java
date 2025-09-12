
public class Sum_of_digit {
	
	public static void main(String[] args) {
		
		int n=12345;
		int sum=0;
		int r;
		
		
		while(n>0) {
			
			r=n%10;
            sum= sum+r;			
			n=n/10;
			
			
		}
		System.out.println(sum);

		
	}

}    