package DXC;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) 
	{
		int n ;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the you want to check number: ");
			n=sc.nextInt();
		}
		int temp = n;
        int c = 0;
 
        while (n > 0) {
        	
        	
 
            int r = n % 10;
            c = (c) + (r * r * r);
            n = n / 10;
        }
 
 
        if (temp == c) {
            System.out.println("Yes. It is Armstrong No.");
        }
        else {
            System.out.println(
                "No. It is not an Armstrong No.");
        }
	

	}

}
