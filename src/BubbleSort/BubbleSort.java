package BubbleSort;

public class BubbleSort {

	public int[] sort(int[] arr) {
		int n = arr.length;
		
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n -i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		BubbleSort bubbleSort = new BubbleSort();
		int[] arr = { 300,100, 90, 110, 80, 280, 200, 150 };
		System.out.println("Bubble Sort");
		System.out.println("before sorting");
		for (int a : arr) {
			System.out.print(a + "\s");
		}
		System.out.println();
		int[] new_arr = bubbleSort.sort(arr);
		System.out.println();
		System.out.println("after sorting");
		for (int a : new_arr) {
			System.out.print(a + "\s");
		}
	}

}
