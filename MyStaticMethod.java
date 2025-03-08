import java.io.*;
import java.util.*;

class Emp
{
	int eid;
	String ename;
	static String ecom;

	Emp(int id,String nm)
	{
		eid=id;
		ename=nm;

	}

	void display()
	{
		System.out.println("\n\t EID: "+eid+"\t ENAME: "+ename+"\t ECOM: "+ecom);
	}

	static void change(String nm)
	{
		ecom=nm;
	}
}

class MyStaticMethod
{
	public static void main (String args[])
	{
		Emp e1=new Emp(101,"chirag");
		Emp e2=new Emp(102,"kishan");

		Emp.change("NOVA");

		e1.display();
		e2.display();

		
		}
	}
}
