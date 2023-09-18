package InsertionSort;


public class InsertionSort {
	
	int[] sort(int arr[]) {
		int n = arr.length;
		for(int i=1;i<n;i++) {
			int key = arr[i];
			int j = i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1] = arr[j];
				j=j-1;
			}
			arr[j+1] = key;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		InsertionSort insertionSort = new InsertionSort();
		int[] arr = { 300,100, 90, 110, 80, 280, 200, 150 };
		System.out.println("Insertion Sort");
		System.out.println("before sorting");
		for (int a : arr) {
			System.out.print(a + "\s");
		}
		System.out.println();
		int[] new_arr = insertionSort.sort(arr);
		System.out.println();
		System.out.println("after sorting");
		for (int a : new_arr) {
			System.out.print(a + "\s");
		}
	}

}
