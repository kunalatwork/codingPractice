package SearchAlgorithms;

public class BinaryArray {
	int binary(int arr[], int l, int r, int x) {
		if(r>=l) {
			int min = l+(r-l)/2;
			if(arr[min]==x)
				return min;
			if(arr[min]>x)
			return binary(arr, l, r-1, x);
			if(arr[min]<x)
				return binary(arr, l+1, r, x);
			
		}
		
		return -1;
	}

	public static void main(String[] args) {
		BinaryArray b = new BinaryArray();
		int arr[] = {1,3,6,9,13,15,17,19,21,24,27,32};
		int n= arr.length;
		int x = 24;
		int result = b.binary(arr, 0, n-1, x);
		if(result==-1) {
        System.out.println("not present");
		}
		else
			System.out.println("Position is = "+ result);

	}
}
