import java.io.*;
import java.util.*;

class Bank
{
	int rate()
	{
		return 0;
	}
}
class Axis extends Bank
{
	int rate()
	{
		return 8;
	}
}
class Bob extends Bank
{
	int rate()
	{
		return 9;
	}
}
class Sbi extends Bank
{
	int rate()
	{
		return 6;
	}
}
class MyOverride
{
	public static void main(String args[])
	{
		Axis b1=new Axis();
		rate=b1.rate();
		System.out.print("\n\t interest rate: "+rate);

		Bob b2=new Bob();
		rate=b2.rate();
		System.out.print("\n\t interest rate: "+rate);

		Sbi b3=new Sbi();
		rate=b3.rate();
		System.out.print("\n\t interest rate: "+rate);
	}
}