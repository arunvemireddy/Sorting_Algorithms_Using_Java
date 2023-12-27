package Quicksort;

import java.util.Arrays;

public class Quicksort {
	
	int[] swapFun(int[] arr,int i,int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return arr;
	}
	
	int pivot(int[] arr, int pivotIndex,int endIndex) {
		int swapIndex = pivotIndex;
		for(int i=pivotIndex+1;i<=endIndex;i++) {
			if(arr[i]< arr[pivotIndex]) {
				swapIndex++;
				swapFun(arr, swapIndex, i);
			}
		}
		swapFun(arr, pivotIndex,swapIndex);
		return swapIndex;
	}
	
	public void quickSortHelper(int[] array,int left,int right) {
		if(left<right) {
			int pivotIndex = pivot(array,left,right);
			quickSortHelper(array,left,pivotIndex-1);
			quickSortHelper(array,pivotIndex+1,right);
		}
	}
	
	public void quickSort(int[] arr) {
		quickSortHelper(arr, 0, arr.length-1);
	}
	
	public static void main(String[] args) {
		int[] myArray = {4,6,1,7,3,2,5};
		Quicksort quicksort = new Quicksort();
		quicksort.quickSort(myArray);
		System.out.println(Arrays.toString(myArray));
	}
}
