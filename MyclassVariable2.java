import java.io.*;
import java.util.*;

class Emp
{
	int eid;
	String ename;

	void set_data(int id,String nm)
	{
		eid=id;
		ename=nm;
	}

	void display()
	{
		System.out.println("\n\t Employee ID: "+eid);
		System.out.println("\n\t Employee name: "+ename);
	}
}

class MyclassVariable
{
	public static void main(String args[]) throws IndexOutOfBoundsException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		Emp e=new Emp();

		System.out.print("\n\t Enter Emp ID: ");
		int id=Integer.parseInt(br.readerLine());

		System.out.print("\n\t Enter Emp Name: ");
		String nm=br.readerLine();

		e.set_data(id,nm);

		e.display();
	}
}