import java.io.*;
import java.util.*;

class Account
{
	int ac_no;
	String ac_name;
	double ac_bal;
	String ac_mobile;
	String ac_email;
	double tran[]=new double[100];
	int no=0;

	Account(int no,String nm,double bal,String email)
	{
		ac_no=no;
		ac_name=nm;
		ac_bal=bal;
		ac_mobile=mob;
		ac_email=email;

		tran[no++]=bal;
	}
	void deposite(double amt)
	{
		ac_bal+=amt;
		tran[no++]=amt;
	}

	void withdraw(double amt)
	{
		ac_bal-=amt;
		double temp=(amt-amt)-amt;

		tran[no++]=temp;
	}
}

class Bank
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		BufferedReader br=new FufferedReader(new InputStreamReader(System.in));

		Account ac[]=new Account[20];
		int c=0;

		int ch=0;
		do
		{
			System.out.print("\n\t 1.Open new Ac");
			System.out.print("\n\t 2.Display Ac Detail");
			System.out.print("\n\t 3.Deposite Amt");
			System.out.print("\n\t 4.Withdrow Amt");
			System.out.print("\n\t 5.Generate passbook");
			System.out.print("\n\t 6.Exit");
			System.out.print("\n\t Enter your choice");
			ch=s.nextInt();

			switch(ch)
			{
				case1:
				{
					System.out.print("\n\t Enter Ac no: ");
					int no=s.nextInt();

					System.out.print("\n\t Enter Ac Holder Name: ");
					String nm=br.readline();

					System.out.print("\n\t Enter Ac Balance: ");
					double bal=s.nextDouble();

					System.out.print("\n\t Enter mobile No: ")
					String mob=br.readline();

					System.out.print("\n\t Enter AC email: ");
					String email=br readline();

					if (bal>=10000) 
					{
						ac[c++]=new Account(no,nm,bal,mob,email);
						System.out.print("\n\t Register successfully");						
					}
					else
					{
						System.out.print("\n\t minimum 10000 required");
					}
					break;
				}
				
				case2:
				{
					int flag=0;
					//System.out.print("\n\t Total Ac: "+c);

					System.out.print("\n\t Enter Search Ac no: ");
					int search=s.nextInt();

					for (int i=0;i<c;i++) 
					{
						System.out.print("\n\t Ac No"+a[i].ac_no);
						System.out.print("\n\t Ac Name"+a[i].ac_name);
						System.out.print("\n\t Ac Balance"+a[i].ac_bal);
						System.out.print("\n\t Ac Mobile"+a[i].ac_mobile);
						System.out.print("\n\t Ac email"+a[i].ac_email);

						flag=1;
					}
				}

				if (flag==0) 
				{
					System.out.print("\n\t Ac not found");	
				}
				case3:
				{
					int flag=0;

					System.out.print("\n\t Enter Search Ac No: ");
					int search=s.nextInt();

					for (int i=0;i<c;i++) 
					{
						if(ac[i].ac_no==search)
						{
							System.out.print("\n\t Enter Deposite Amount");
							double amt=s.nextDouble();

							if (amt>0) 
							{
								ac[i].deposite(art);
								System.out.print("\n\t deposite successfully");
							}
							else
							{
								System.out.print("\n\t Enter valid Amount");
							}
							flag=1;
							break;
						}
					}
					if (flag==0) 
					{
						System.out.print("\n\t Ac not found");	
					}
					break
				}
				case4:
				{
					int flag=0;

					System.out.print("\n\t Enter Search Ac no: ");
					int search=s.nextInt();

					for (int i=0;i<c;i++) 
					{
						if (ac[i].ac_no==search) 
						{
							System.out.print("\n\t Enter Withdrow Amount: ");
							double amt=s.nextDouble();

							if (amt>0) 
							{
								double remain=ac[i].ac_bal-amt;

								if (remain>=10000) 
								{
									ac[i].Withdrow(amt);
									System.out.print("\n\t amt withdraw successfully");			
								}
								else
								{
									System.out.print("\n\t you can not withdraw");
								}			
							}		
							else
							{
								System.out.print("\n\t Enter valid Amount");
							}

							flag=1;
							break;
						}
					}
					if (flag==0) 
					{
						System.out.print("\n\t Ac not found");
					}
					break;
				}
				case5:
				{
					int flag=0;

					System.out.print("\n\t Enter Search Ac No: ");
					int search=s.nextInt();

					for (int i=0;i<c;i++) 
					{
						if (ac[i].ac_no==search) 
						{
							System.out.print("\n\t ac[i].ac_name passbook");
							System.out.print("\n\t TranID    Deposite    Withdrow");

							for (int j=0;j<ac[i].no;j++) 
							{
								if (ac[i].tran[j]>0) 
								{
									System.out.print("\n\t    "+(j+1)+"    "+ac[i].tran[j]);

								}	
								else
								{
									System.out.print("\n\t                  "+(j+1)+"" +ac[i].tran[i]);
								}
							}	
							System.out.print("\n\t Current Balance is: "+a[i].ac_bal);
							
							flag=1;
							break;
						}

						if (flag==0) 
						{
							System.out.print("\n\t Ac not found");	
						}	
						break;
					}
				}
				case6:
				{
					break;
				}
				default:
				{
					System.out.print("\n\t your choice");
				}
			}while(ch!=6);
		}
	} 
}