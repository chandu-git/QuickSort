package quickSort;

public class QuickSort {
	/**
	 * select a pivot from a list, and then reordering the list 
	 * so that all of the elements that are smaller than the pivot go to the left, 
	 * and all of the elements that are larger than the elements go to the right.
	 * Recursively apply to smaller subsets.
	 */
	static void quickSort(int arr[], int left, int right) {
	      int index = partition(arr, left, right);
	      if (left < index - 1)
	            quickSort(arr, left, index - 1);
	      if (index < right)
	            quickSort(arr, index, right);
	}
	
	static int partition(int arr[], int left, int right){
	      int i = left, j = right;
	      int tmp;
	      int pivot = arr[(left + right) / 2];
	      while (i <= j) {
	            while (arr[i] < pivot)
	                  i++;
	            while (arr[j] > pivot)
	                  j--;
	            if (i <= j) {
	                  tmp = arr[i];
	                  arr[i] = arr[j];
	                  arr[j] = tmp;
	                  i++;
	                  j--;
	            }
	      };
	      return i;
	}
	
	public static void main(String[] args) {
		int[] arr = {98,1,5,8,3,2,24,56,78,90,12,34};
		quickSort(arr, 0, 11);
		for(int i: arr){
			System.out.print(i+", ");
		}
	}
}
