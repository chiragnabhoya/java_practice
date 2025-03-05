import java.io.*;
import java.util.*;

class A
{
	int a;
	void display()
	{
		System.out.println("\n\t A: "+a);
	}
}

class B extends A
{
	int b;
	void set_data(int aa,int bb)
	{
		a=aa;
		b=bb;

		display();
		this.displayB();
	}
	void displayB()
	{
		System.out.println("\n\t B:"+b);

	}
}

class MysingleIn
{
	public static void main (String args[])
	{
		B b1 = new B();
		b1.Set_data(100,200);

	}
}