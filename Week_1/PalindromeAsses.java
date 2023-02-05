package DXC;

import java.util.Scanner;

public class PalindromeAsses {

	public static void main(String[] args) {  
			  int r,sum=0,temp;
			  int n;
			  try (Scanner sc = new Scanner(System.in)) {
				System.out.println("Enter the you want to check number: ");
				n=sc.nextInt();
			}
				temp=n;    
			  while(n>0){    
			   r=n%10;
			   sum=(sum*10)+r;    
			   n=n/10;    
			  }    
			  if(temp==sum)    
			   System.out.println("The number you have entered is palindrome.");    
			  else    
			   System.out.println("The number you have entered is not a palindrome.");    
			}  


	}
