import java.io.*;
import java.util.*;

class DemoThread extends Thread
{
	public void run()
	{
		System.out.println("\n\t Thread: "+Thread.currentThread().getName());
		System.out.println("\n\t Thread priority: "+Thread.currentThread().getpriority());
	}
}

class MyThread7 
{
	public static void main(String args[])
	{
		DemoThread d1=new DemoThread();
		DemoThread d2=new DemoThread();
		DemoThread d3=new DemoThread();

		d1.setName("MyThread1");
		d2.setName("MyThread2");
		d3.setName("MyThread3");

		d1.setpriority(Thread NORM_PRIORITY);
		d2.setpriority(Thread MIN_PRIORITY);
		d3.setpriority(Thread MAX_PRIORITY);

		d1.start();		
		d2.start();
		d3.start();

	}
}
