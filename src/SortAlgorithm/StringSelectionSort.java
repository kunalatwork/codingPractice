package SortAlgorithm;

public class StringSelectionSort {

	public static void main(String[] args) {
	
		String a[] = {"kunal","rawat","Ravi","Dinesh","Jatin","James"};
	    int n= a.length, m;
	    String temp = "";
	    for(int i=0; i<n; i++) {
	    	m=i;
	    	for(int j=i+1; j<n; j++) {
	    		if(a[j].compareTo(a[m])<0) {
	    			m=j;
	    			
	    		}
	    		
	    	}
	    	temp=a[i];
	    	a[i]=a[m];
	    	a[m]=temp;
	    }
	    
	    for(int i=0; i<n; i++)
	    {
	    	System.out.print(a[i]+" ");
	    }
		
	}

}
