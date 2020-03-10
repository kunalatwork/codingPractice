package SortAlgorithm;

public class SelectionSort {
	
/* Selection Sort - 
The selection sort algorithm sorts an array by repeatedly finding the minimum element (considering ascending order) 
from unsorted part and putting it at the beginning. 
 */

	public static void main(String[] args) {
	
		int a[] = {36,24,32,26,43,13,54,15};
		int n=a.length, m, temp=0;
		for(int i=0; i<n;i++) 
		{
			m=i;
			for(int j=i+1; j<n;j++) 
			{
				if(a[j]<a[m]) 
				{
					m=j;
				}
				temp=a[i];
				a[i]=a[m];
				a[m]=temp;
				
			}
		}
		for(int i=0; i<n;i++) 
		System.out.print(a[i]+" ");

	}

}
