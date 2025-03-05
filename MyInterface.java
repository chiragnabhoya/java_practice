import java.io.*;
import java.util.*;

interface Bank
{
	int rate();
}
class SBI implements Bank
{
	public int rate();
	{
		return 7;

	}
}
class Axis implements Bank
{
	public int rate();
	{
		return 5;
	}
}
class MyInterface
{
	public static void main(String args[])
	{
		SBI b=new SBI();
		int r = b.rate();
		System.out.println("\n\t SBI bank rate is: "+r);

		Axis a = new Axis();
		r=a.rate();
		System.out.println("\n\t Axis bank rate is: "+r);

	}
}