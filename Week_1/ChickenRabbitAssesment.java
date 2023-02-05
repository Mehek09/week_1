package DXC;

import java.util.Scanner;

class Chicken
{
	static int countRabbits(int Heads,
	                        int Legs)
	{
	    int count = 0;
	 
	    count = (Legs) - 2 * (Heads);
	    count = count / 2;
	 
	    return count;
	}
	 
	public static void main(String args[])
	{
	    int Heads,Legs;
	    try (Scanner sc = new Scanner(System.in)) {
			{
				System.out.println("Enter the number of heads:");
				Heads = sc.nextInt();
				System.out.println("Enter the number of legs:");
				Legs = sc.nextInt();
				
 
				int Rabbits = countRabbits(Heads, Legs);
 
				System.out.println("Rabbits = " +
				                    Rabbits);
				System.out.println("Chickens = " +
				                  (Heads - Rabbits));
			}
		}
	}
	}
