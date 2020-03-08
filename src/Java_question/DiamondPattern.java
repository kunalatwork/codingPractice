package Java_question;

public class DiamondPattern {

	public static void main(String[] args) {
	 int i,j,k,l;
	 for(i=1; i<=5; i++) {
			
			for(j=4;j>=i;j--) {
				System.out.print(" ");
			}
			for(k=1;k<=i;k++) {
				System.out.print("*");
			}
			for(l=2;l<=i;l++) {
				System.out.print("*");
			}
			System.out.println();
		}
	 
	 for(i=1; i<=5; i++) {
		 for(j=2;j<=i;j++) {
			 System.out.print(" ");
		 }
		 for(k=5;k>=i;k--) {
			 System.out.print("*");
			 
			 }
		 for(l=4;l>=i;l--) {
			 {
				 System.out.print("*");
			 }
		 }
		 System.out.println();
	 }

		}
	

 }
