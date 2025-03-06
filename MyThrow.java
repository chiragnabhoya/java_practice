import java.io.*;
import java.util.*;

class MyThrow 
{
	public static void main(String args[])
	{
		Scanner s =new Scanner(System.in);

		try
		{
			System.out.print("\n\t enter no");
			int no = s.nextInt();

			if (no<=0) 
			{
				throw new ArithmeticException("No must be positive");
			}
			else
			{
				System.out.print("\n\t No is: "+no);
			}
		}
		catch(ArithmeticException e)
		{
			System.out.print("\n\t"+e);
		}
	}
}