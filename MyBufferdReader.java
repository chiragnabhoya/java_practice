import java.io.*;
import java.util.*;

class MyBufferedReader
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br= new MyBufferedReader(new InputStreamReader (System.in) );
		
		System.out.print("\n\t enter no ");
		int no =Integer.parseInt(br.readLine() );

		System.out.print("\n\t enter no2 ");
		Double no2 =Double.parseDouble (br.readLine() );

		System.out.print("\n\t enter String ");
		String str = br.readLine();

		System.out.print("\n\t no is "+no);
		System.out.print("\n\t no2 is "+no2);
		System.out.print("\n\t no3 is "+str);
	}
}
