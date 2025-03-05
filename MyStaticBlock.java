import java.io.*;
import java.util.*;

class Emp
{
	int eid;
	String ename;
	static String ecom;

	static 
		{
			ecom="NOVA";

			System.out.println("\n\t static block call..");
		}

		Emp(int id,String nm)

		{
			eid=id;
			ename=nm;

			System.out.println("\n\t constructor call..");
		}

		void display()
		{
			System.out.println("\n\t method call..");
			System.out.println("\n\t eID: "+eid+"\t ENAME"+ename+"\t ECOM"+ecom);
		}
}

class MyStaticBlock
{
	public static void main(String args[])
	{
		Emp e1=new Emp(101,"ankit");
		Emp e2=new Emp(102,"chirag");


		e1.display();
		e2.display();

	}
}