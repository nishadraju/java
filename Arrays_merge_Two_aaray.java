package p6;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Arrays_merge_Two_aaray {
	public static void main(String[] args) {

		int[] a = { 1, 2, 3 };
		int[] b = { 4, 5, 6 };

		int a_leng = a.length;
		int b_leng = b.length;
		int c_leng = a_leng + b_leng;

		int[] c = new int[c_leng];

		for (int i = 0; i < a_leng; i++) {
			c[i] = a[i];

		}
		for (int i = 0; i < b_leng; i++) {
			c[a_leng + i] = b[i];

		}

		for (int i = 0; i < c_leng; i++) {
			System.out.println(c[i]);

		}

	}

}
