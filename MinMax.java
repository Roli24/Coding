

public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		  int arr[] = { 12, 45, 67, 1,1456 };
		 System.out.println(getMin(arr,arr.length));
		 System.out.println(getMax(arr,arr.length));


	}

	private static int getMin(int[] arr, int n) {
		// TODO Auto-generated method stub
		if(n == 0)
			return arr[0];
		
		return Math.min(arr[n-1], getMin(arr, n-1));
		
	}
	
	private static int getMax(int[] arr, int n) {
		// TODO Auto-generated method stub
		if(n == 0)
			return arr[0];
		
		return Math.max(arr[n-1], getMax(arr, n-1));
		
	}

}
