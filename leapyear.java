//Program to check a year is leap yaer or not using command line argument


public class leapyear {
	
	public static void main(String args[])
	{
		int year=0;
		year=Integer.parseInt(args[0]);
		
		if((year%400==0)||(year%4==0)&&(year%4!=0))
			System.out.println("It's a Leap year.");
		else
			System.out.println("Not a leap year. ");
		
	
	}

}
