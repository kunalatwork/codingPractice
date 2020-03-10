package SortAlgorithm;

public class StringBubbleSort {

	public static void main(String[] args) {
		String a[] = {"kunal","rawat","Ravi","Dinesh","Jatin","James"};
        String temp;
        int f=0;
        int n= a.length;
        for(int i=0; i<n; i++ ) {
        	for(int j=0; j<n-1-i; j++) {
        		if(a[j].compareTo(a[j+1])>0) {
        			temp=a[j];
        			a[j]=a[j+1];
        			a[j+1]=temp;
        			
        		}
        	}
        }
        
        for(int i=0; i<n; i++ )
        {
        	System.out.print(a[i]+" ");
        }
	}

}
