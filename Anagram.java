import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		
		//check to  string Anagram is nmot
		
		String x="raju";
		String y="jura";
		
		char[]a=x.toCharArray();
		char[]b=y.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		boolean result=Arrays.equals(a, b);
		
		if(result== true) {
			System.out.println("Anagram");
			
			
		}else {
			
			System.out.println("not Anagram");
		}
		
		
	}

}
