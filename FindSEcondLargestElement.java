
public class FindSEcondLargestElement {
	public static void main(String[] args) {

		int arr[] = { 3, 6, 9, 8, 5, 214, 7 };
		int first = arr[0];
		int second = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > first) {
				second = first;
				first = arr[i];

			} else if (arr[i] > second) {
				second = arr[i];

			}

		}
		
		System.out.println(second);

	}
}
