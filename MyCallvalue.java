import java.io.*;
import java.util.*;

class MyCallvalue
{
	public static void swap(int aa,int bb)
	{
		int c=aa;
		aa=bb;
		bb=c;

		System.out.println("\n\t In call \t A:"+aa+"\t B:"+bb);
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("\n\t Enter A: ");
		int aa=s.nextInt();
		
		System.out.println("\n\t enter B: ");
		int bb=s.nextInt();

		System.out.println("\n\t before call \t A:"+aa+"\t B:"+bb);
		
		swap(aa,bb);
		System.out.println("\n\t after call \t A:"+aa+"\t B:"+bb);
	}
}