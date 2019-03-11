package starpattern;

import java.util.Scanner;

public class oneside 
{
public static void main(String[] args)
{
	System.out.println("enter a no");
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	//int count=0;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(j);
			//count = count+1;
			//System.out.print(count);
		}
		System.out.println(" ");
	}
}
}
