package pattern;
import java.util.Scanner;

public class diamond {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.print("enter no. of row:");
		int row = Sc.nextInt();
		Sc.close();
		int i,j;
		for(i=0;i<row;i++)
		{
			for(j=row-i; j>1; j--)
			{
				System.out.print(" ");
			}
			for(j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	
}
} 