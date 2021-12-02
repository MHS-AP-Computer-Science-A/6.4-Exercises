import java.util.Arrays;

public class Ex6_4_1_ExploreSelectionSort {
	public static void main(String[] args) {
		int[] array1 = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		int[] array2 = { 5, 6, 4, 8, 9, 7, 3, 1, 2 };

		System.out.print("First array: ");
		System.out.println(Arrays.toString(array1));
		System.out.print("Second array: ");
		System.out.println(Arrays.toString(array2));
		System.out.println();

		// sort first array
		selectionSort(array1);
		// sort second array
		selectionSort(array2);

		System.out.print("\nFirst array sorted: ");
		System.out.println(Arrays.toString(array1));
		System.out.print("Second array sorted: ");
		System.out.println(Arrays.toString(array2));
	}

	public static void selectionSort(int[] arr) {
		// Traverse indexes up to second to last element
		for (int index = 0; index < arr.length - 1; index++) {
			// Find the smallest value
			int minIndex = index;
			for (int i = index + 1; i < arr.length; i++) {
				if (arr[i] < arr[minIndex]) {
					minIndex = i;
				}
			}
			// Swap minIndex and index
			int temp = arr[index];
			arr[index] = arr[minIndex];
			arr[minIndex] = temp;
		}
	}
}
