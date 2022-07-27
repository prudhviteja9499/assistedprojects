package slassistedproject;



import java.util.Arrays;

public class statisticsorders {
	
	public static int KthSmallest(Integer[] arr,int k) {
		
		Arrays.sort(arr);
		
		
		return arr[k-1]; 
		
	}
	
	public static void main(String[] args) {
		
		Integer arr[]= new Integer[] {22,55,88,77,44,99,33,11,66};
		
		int k=4;  //finding fourth smallest element in an unsorted array
		
		System.out.println("Kth Smallest Element is : "+ KthSmallest(arr, k) );
	}

}