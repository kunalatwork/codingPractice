package SortAlgorithm;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {5,1,6,2,4,3};
		int n=a.length, temp=0;

		for(int i = 0 ; i < n-1 ; i++ )
		{
		for(int k = i + 1 ; k > 0 ; k-- )
		{
		if(a[k] < a[k-1])
		{
		temp = a[k];
		a[k] = a[k-1];
		a[k-1] = temp;
		}
		}
		}
		for(int i = 0 ; i < n ; i++ )
			System.out.print(a[i]+" ");

	}

}
