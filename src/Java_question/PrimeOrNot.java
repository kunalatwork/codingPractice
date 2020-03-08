package Java_question;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
	int temp=0,num;
	System.out.println("Write your number");
	Scanner x = new Scanner(System.in);
	num = x.nextInt();
	for(int i=2; i<=num-1;i++) {
		if(num%i==0) {
			temp=temp+1;
		}
	}
	if(temp==0) {
		System.out.println("prime");
	}
	else {
		System.out.println("Not Prime");
	}

	}

}
