import java.io.*;
import java.util.*;

class DemoA
{
	int a;
	void printA() 
	{
		System.out.print("\n\t A is: "+a);
	}
}
class DemoB extends DemoA
{
	int a;

	void setdata(int a,int b)
	{
		super.a=a;
		this.a=b;
	}
	 void print()
	 {
	 	super.print();
	 	System.out.print("\n\t B is "+a);
	 }
}
class Mysuper2
{
	public static void main(String args[])
	{
		DemoB o=new DemoB();

		o.setdata(10,20);
		o.print();
	}
}
