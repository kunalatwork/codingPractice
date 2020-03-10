package Arrays;

public class SumOfArray {
	public static void main(String[] args) {
		int[] a = {2,4,6,8,9};
		int sum=0;
		for (int i =0;i<a.length;i++)
		{
			sum+=a[i];
		}
		System.out.println(sum);
	}
}
