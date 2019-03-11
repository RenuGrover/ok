package starpattern;

import java.util.Scanner;

public class oppside
{
public static void main(String[] args) 
{
	System.out.println("enter a no");
	Scanner s=new Scanner(System.in);
	int n= s.nextInt();
	
	for(int i=1;i<=n;i++)
	{
		for(int j=n-1;j>=i;j--)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=i;k++)
		{
			System.out.print("*");
		}
		for(int l=2;l<=i;l++)
		{
		System.out.print("*");
		}
		System.out.println(" ");
	}
	
}
}
