package p6;

import java.util.HashSet;

public class Arrays_RemoveDuplicate {
	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 4, 5 };

		HashSet<Integer> hs = new HashSet();

		for (int i = 0; i < a.length; i++) {
			hs.add(a[i]);

		}
		
		for(int no:hs) {
			System.out.println(no+" ");
			
			
		}

	}

}
