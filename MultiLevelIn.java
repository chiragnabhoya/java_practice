import java.io.*;
import java.util.*;

class A
{
	void displayA();
	{
		System.out.println("\n\t class A-DisplayA call");
	}
}
class B extend A
{
	void displayB()
	{
		System.out.println("\n\t class B-DisplayB call");
	}
}

class C extends B
{
	void displayC()
	{
		this.displayA();
		this.displayB();
		System.out.println("\n\t class C-DisplayC call");
	}
}

class MyMultiLevelIn
{
	public static void main(String args[])
	{
		C c=new c();
		c.display();
	}
}