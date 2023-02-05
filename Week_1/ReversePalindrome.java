package DXC;

import java.util.Scanner;

public class ReversePalindrome {
	private static final String Sytsem = null;
	{
		static void armstrong(int num)
		
		{ int d,org, count;
		double sum=0;
		count=0;
		org=num;
		while(n!=0)
		{
			count++;
			num=num/10;
		}
		num = org;
		while(num>0)
		{
			d = num % 10;
            sum = (sum) + Math.pow(num,count);
            num = num / 10;
		}
		System.out.println("Sum of digits:"+sum);
		if(org==sum)
			Sytsem.out.println("The number is armstrong");
		else
			System.out.println("The number is not armstrong");
		
		
	}
		static void reverse(int num)     
		{     
		int num1;   
		Scanner sc= new Scanner(System.in);  
		System.out.print("Enter the number: ");    
		num1=sc.nextInt();  
		if((num1))  
		{  
		System.out.print("Armstrong ");  
		}  
		else   
		{  
		System.out.print("Not Armstrong ");  
		}  


}
	}
