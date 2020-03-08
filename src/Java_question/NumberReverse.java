package Java_question;

public class NumberReverse {

	public static void main(String[] args) {
	
		int num= 243576876, Rev=0;
		
		while(num!=0) {
			int Rem=num % 10;
			Rev=Rev*10 + Rem;
			num=num/10;
			
		}
		System.out.println(Rev);
}
	
}