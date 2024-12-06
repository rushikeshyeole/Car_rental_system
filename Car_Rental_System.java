import java.util.Scanner;

class Car
{
	String carModel;
	String registrationNumber;
	int rentalRatePerDay;
	boolean availability;

	void displayData()
	{
		System.out.println("Car Type : "+ carModel);
		System.out.println("Registration Number  : "+ registrationNumber);
		System.out.println("Rent per Day : "+ rentalRatePerDay);
	}
	
	void rentCalulation(int hr)
	{
		int toalRent = rentalRatePerDay * hr;
		System.out.println("Your Total Rent is : " + toalRent);
		System.out.println("Thank You...!!");
	}	
}
public class Car_Rental_System {
	
	public static void main(String[] args)
	{
		Scanner n = new Scanner(System.in);
		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car();
		
//		Car 1 Details
		
		c1.carModel = "SUV";
		c1.registrationNumber = "MH18CA9999";
		c1.rentalRatePerDay = 1500;
		c1.availability = true;
		
//		Car 2 Details
		
		c2.carModel = "Sedan";
		c2.registrationNumber = "MH18CA9999";
		c2.rentalRatePerDay = 1000;
		c2.availability = true;
		
//		Car 3 Details
		
		c3.carModel = "Bike";
		c3.registrationNumber = "MH18CA9999";
		c3.rentalRatePerDay = 700;
		c3.availability = true;
		
		
		
		
		
		while(true)
		{
            System.out.println("--------------------------------------------------------");
            System.out.println("Welcome to Car Rental Shop");
			System.out.println("1) Rent a Car \n2) Return a Car \n3) Rental Charges");
			int uI = n.nextInt();
			switch(uI)
			{
			case 1:
				System.out.println("------------------------------------------------------");
				System.out.println("Which vehicle do you want to take on rent : ");
				System.out.println("1) SUV \n2) Sedan \n3) Bike");
				int vI = n.nextInt();
				switch(vI)
				{
				case 1:
					if(c1.availability == true)
					{
						System.out.println("---------------------------------------------------");
						System.out.println("Vehicle is available");
						System.out.println("      ");
						c1.displayData();
						System.out.println("---------------------------------------------------");
						System.out.println("Do you want rent ?");
						System.out.println("1) Yes \n2)No");
						int rI = n.nextInt();
						switch(rI)
						{
						case 1:
							c1.availability = false;
							System.out.println("---------------------------------------------------");
							System.out.println("Thank You...!");
							break;
							
						case 2:
							c1.availability = true;	
							System.out.println("---------------------------------------------------");
							System.out.println("Thank You...!");
							break;
						}
					}
					else
					{
						System.out.println("---------------------------------------------------");
						System.out.println("Vehicle is not available");
					}
					break;
					
				case 2:
					if(c2.availability == true)
					{
						System.out.println("Vehicle is available");
						System.out.println("              ");
						c2.displayData();
						System.out.println("---------------------------------------------------");
						System.out.println("Do you want rent ?");
						System.out.println("1) Yes \n2)No");
						int rI = n.nextInt();
						switch(rI)
						{
						case 1:
							c2.availability = false;
							System.out.println("---------------------------------------------------");
							System.out.println("Thank You...!");
							break;
							
						case 2:
							c2.availability = true;	
							System.out.println("---------------------------------------------------");
							System.out.println("Thank You...!");
							break;
						}
					}
					else
					{
						System.out.println("---------------------------------------------------");
						System.out.println("Vehicle is not available");
					}
					break;
					
				case 3:
					if(c3.availability == true)
					{
						System.out.println("---------------------------------------------------");
						System.out.println("Vehicle is available");
						System.out.println("          ");
						c3.displayData();
						System.out.println("---------------------------------------------------");
						System.out.println("Do you want rent ?");
						System.out.println("1) Yes \n2)No");
						int rI = n.nextInt();
						switch(rI)
						{
						case 1:
							c3.availability = false;
							System.out.println("---------------------------------------------------");
							System.out.println("Thank You...!");
							break;
							
						case 2:
							c3.availability = true;	
							System.out.println("---------------------------------------------------");
							System.out.println("Thank You...!");
							break;
						}
					}
					else
					{
						System.out.println("---------------------------------------------------");
						System.out.println("Vehicle is not available");
					}
				}
			break;	
			
			case 2:
				System.out.println("---------------------------------------------------");
				System.out.println("Which vehicle had you took on rent : ");
				System.out.println("1) SUV \n2)Sedan \n3)Bike");
				int rvI = n.nextInt();
				System.out.println("Enter rent hour : ");
				int hI = n.nextInt();
				
				if(rvI == 1)
				{
					c1.availability = true;
					c1.rentCalulation(hI);
				}
				else if(rvI == 2)
				{
					c2.availability = true;
					c2.rentCalulation(hI);
				}
				else if(rvI == 3)
				{
					c3.availability = true;
					c3.rentCalulation(hI);
				}
			break;
				
			case 3:
				System.out.println("--------------------------------------------------------");
				System.out.println(c1.carModel + " : " + c1.rentalRatePerDay);
				System.out.println(c2.carModel + " : " + c2.rentalRatePerDay);
				System.out.println(c3.carModel + " : " + c3.rentalRatePerDay);
				
			break;  			
			}
	  }
			
	}

}
