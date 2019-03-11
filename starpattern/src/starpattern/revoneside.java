package starpattern;

import java.util.Scanner;

public class revoneside 
{
public static void main(String[] args) 
{
	System.out.println("enter a no");
	Scanner s=new Scanner(System.in);
	int n= s.nextInt();
	for(int i=n;i>=1;i--)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print("*");
		}
		System.out.println(" ");
	}
}
}
