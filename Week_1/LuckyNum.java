package Week_1;

import java.util.Scanner;
public class LuckyNum {
	static void LuckyNum( int n )
	{
		int r=0,sum=0;
		while(n!=0)
		{
			r=n%10;
		    sum=sum+r*r;
			
			n=n/100;
		}	
			if(sum%9==0)
			{
				System.out.println("It's a lucky number");
			}
			else
			{
				System.out.println("It is'nt a lucky number");
			}
		}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value");
		int n=sc.nextInt();
		LuckyNum(n);

}
}
