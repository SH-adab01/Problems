package pattern;

import java.util.Scanner;

public class number2 {
	public static void main(String[] args){
		Scanner Sc = new Scanner(System.in);
		System.out.print("enter no. of row:");
		int row = Sc.nextInt();
		Sc.close();
		int i,j;
		for(i= 1;i<row;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			for(j=i-1;j>=1;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}
}
