import java.io.*;
import java.util.*;

class Emp
{
	int eid;
	String ename;
	static String ecompany;

	Emp(int id ,String nm)
	{
		eid=id;
		ename=nm;
	}

	void display()
	{
		System.out.println("\n\t EMP ID:"+eid+"\t EMP_NAME:"+ename+"\t EMP_COMPONY"+ecompany);

	}
} 


class MyStaticvar
{
	public static void main(String args[])
	{
		Emp.ecompany="NOVA";

		Emp e1 = new Emp(101,"ankit");
		Emp e2 = new Emp(102,"Nishant");

		Emp.ecompony="sutex";

		e1.display();
		e2.display();


	}
}
