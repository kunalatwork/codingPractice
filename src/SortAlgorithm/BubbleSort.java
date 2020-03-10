package SortAlgorithm;

public class BubbleSort {
	
/* 
Bubble Sort - Bubble Sort is the simplest sorting algorithm that works by repeatedly 
swapping the adjacent elements if they are in wrong order.
*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {36,24,32,26,43,13,54,15}; 
		int temp;
		int f = 0;
		int n= a.length;
		for(int i=0; i<n;i++) {
			
			for(int j=0; j<n-1-i;j++) 
			{
				if(a[j]>a[j+1]) 
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					f=1;
					
				}
			}
			
			if(f==0) 
			{
				break;
			}
			
		}
		for(int i=0; i<n;i++)
		System.out.print(a[i]+" ");

	}

}
