//Program to check a number is prime or not

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int i,num,c=0;
		System.out.println("Enter a number - ");
		num=sc.nextInt();
		
		
		for(i=2;i<=num/i;i++)
		{
			if(num%i==0)
			{c=1;
			break;
			}
		}
		
		
		if(c==0)
		{System.out.println("It is a prime number");}
		else
		{System.out.println("It is not a prime number");}
		

	}

}
