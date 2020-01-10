package Programs;


	import java.util.Scanner;

	public class MainHpVisaCard {

	    public static void main(String[] args)
		{
			Scanner sc= new Scanner(System.in);     //Initializing scanner
			
			char ch;
			do {
				
			System.out.println("Enter the holder name");
			String name= sc.next();
			
			System.out.println("Enter the CCV number");
			String ccv= sc.next();
			
			System.out.println("Enter the bill amount");
			double amount= sc.nextDouble();
			
			System.out.println("Mention the type of spending");
			String type= sc.next();
			
			System.out.println("Choose card type\r\n" + "1.VISA card\r\n" + "2.HP VISA card");
			int n= sc.nextInt();
			
			switch(n)
			{
			case 1:VISACard v= new VISACard(name,ccv);
			       double points=v.computeRewardPoints(type, amount);
			       System.out.println("Holder name:"+name);
			       System.out.println("CCV:"+ccv);
			       System.out.println("Reward points:"+points);
			       break;
			case 2:HPVISACard v1= new HPVISACard(name,ccv);
		           double points2=v1.computeRewardPoints(type, amount);
		           System.out.println("Holder name:"+name);
		           System.out.println("CCV:"+ccv);
		           System.out.println("Reward points:"+points2);
		           break;
		    default:System.out.println("Invalid Choice");
		            break;
			}
			System.out.println("Do you want to continue?(Y/N)");
			String choice= sc.next();
			ch= choice.charAt(0);	
		}while(ch=='Y');
		}
	}
