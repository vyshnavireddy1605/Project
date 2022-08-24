import java.util.Scanner;


public class TouristMain {
    Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		Tourist t=new Tourist(105,"Sri","Mumbai","Princess",23,634289587l);
	    System.out.println(t);
	    
	    System.out.println("Hotels");
	    HotelManager s=new HotelManager();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the choice");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			s.TajFalakumaPalace();
			break;
		case 2:
			s.FourSeasonsHotel();
			break;
		}
		

        int ch;
		System.out.println("Transportation");
		System.out.println("1.car");
		System.out.println("2.Bus");
		System.out.println("Enter Your Choice: ");
		ch = sc.nextInt();
				System.out.println("place");
				String place=sc.next();
				System.out.println("amount");
				double amount=sc.nextDouble();


				
		Scanner s1=new Scanner(System.in);
		System.out.println("1.Insert Data");
		System.out.println("2.Delete Data");
		System.out.println("3.view Data");
		System.out.println("4.DeleteAll Data");
		System.out.println("5.Update Data");
		System.out.println("Enter your choice:");
		int choice1=s1.nextInt();
		
		
		switch(choice1)
		{
		case 1: TouristData.addTouristInfo();
			    System.out.println("Tourist Information inserted!!");
			    break;			    
		case 2: TouristData.deleteTouristByRId(105);
	            System.out.println("Tourist details deleted!!");
	            break;	
		case 3: TouristData. viewTouristInfo();
	            System.out.println("Tourist details viewed!!");
	            break;
		case 4: TouristData.deleteAllTouristInfo(109) ;
                System.out.println("Tourist AllDetails Deleted!!");
                break;
		case 5: TouristData.updateTouristById(109) ;
                System.out.println("Tourist AllDetails Updated!!");
                break;
              
		}	
	}
	}
	