package SearchAlgorithms;

import java.util.Arrays;

public class LinearBinary {
	public static int linear (int arr[] , int x) {
		int n = arr.length;
		for(int i=0; i<n;i++) {
			if(arr[i]==x)
				return i;
			
		}
		return -1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,3,6,9,13,15,17,19,21,24,33, 32, 23,27,32};
		int x = 32;
		
		int result = linear(arr,x);
	    Arrays.sort(arr);
		if(result==-1) {
			System.out.println("Not present");
		}
		else {
			System.out.println("Result is = "+result);
		}

	}

}
