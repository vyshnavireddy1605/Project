import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Scanner;

public class TouristData 
{
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	 LinkedList<Tourist>list=new LinkedList<Tourist>();
	static Scanner sc=new Scanner(System.in);
	
		public static void addTouristInfo() 
		{
			
					{
			System.out.print("Enter Tourist RId: ");
			int RId=sc.nextInt();
			System.out.print("Enter Tourist name: ");
			String name=sc.next();
			System.out.print("Enter Tourist address: ");
			String address=sc.next();
			System.out.print("Enter Tourist email: ");
			String email=sc.next();
			System.out.print("Enter Tourist age: ");
			int age=sc.nextInt();
			System.out.print("Enter Tourist Contact: ");
			long Contact=sc.nextLong();
			
			Tourist t=new Tourist(RId,name,address,email,age,Contact);
		  System.out.println(t);	
		}
		}

			public static void deleteTouristByRId(int TouristDeleteData) 
			{
				Scanner sc =new Scanner(System.in);
				System.out.println("Enter Tourist RId to delete ");
				
		        int TouristRId=sc.nextInt();

					
					if(TouristRId==TouristDeleteData)
					{
						System.out.println("Tourist RId exist");
					}
					else
					{
						try
						{
							throw new Exception("not a Tourist RId");
						}
			
						catch(Exception e)
						{
							System.out.println(e);
						}
			}
				
				System.out.println("==================================================================================================");

			}
				

		
public static void viewTouristInfo()
{
	Scanner sc =new Scanner(System.in);
	System.out.println("enter your age:");
	int age=sc.nextInt();
	if(age>=18)
	{
		System.out.println("welcome to trip");
	}
	else
	{
		try
		{
		throw new Exception("Invalid age");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}
}

public static void deleteAllTouristInfo(int TouristRId )
{
	Scanner sc =new Scanner(System.in);
	System.out.println("enter your RId:");
	int RId=sc.nextInt();
	if(RId==TouristRId)
	{
		System.out.println("All details deleted successfully!!");
	}
	else
	{
		try
		{
		throw new Exception("No record available!!");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

}     
	}
      
public static void updateTouristById(int RId) 
{
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter Tourist RId to Update:");
	int UpdateRId=sc.nextInt();
     
		try 
	    {
		if(RId==UpdateRId)
		{
			System.out.println("Tourist RId exist");
		
	
	    	System.out.println("Enter Tourist RId: ");
			int TouristRId1=Integer.parseInt(br.readLine());
			System.out.println("Enter Tourist name: ");
			String Touristname1=br.readLine();
			System.out.println("Enter Tourist address: ");
			String Touristaddress1=br.readLine();
			System.out.println("Enter Tourist email: ");
			String Touristemail1=br.readLine();
			System.out.println("Enter Tourist age: ");
			int Touristage1=Integer.parseInt(br.readLine());
			System.out.println("Enter Tourist Contact: ");
			long TouristContact1=Long.parseLong(br.readLine());
			System.out.println();
			
			Tourist t1=new Tourist(TouristRId1,Touristname1,Touristaddress1,Touristemail1,Touristage1,TouristContact1);
			  System.out.println(t1);	
			System.out.println("==================================================================================================");

			System.out.println("Tourist Details updated!!");
	    }
    	

	    else
	    {
	    	throw new Exception("Id does not exist!!");
	    }
    	}
    	catch(Exception e)
		{
			System.out.println(e);
		}
	System.out.println("==================================================================================================");
	}

}

