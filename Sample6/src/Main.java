import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) throws NumberFormatException, ParseException {
		
		Scanner sc= new Scanner(System.in);//Initialoze scanner
		Map<String,Integer> map1= new HashMap<String,Integer>();//Create map to store string and integer in map
		Map<Date,Map<String,Integer>> map2= new HashMap<Date,Map<String,Integer>>();//Create map to store date and map in map
		
		System.out.println("Enter number of show times");//Get number of shows from user
		int n= Integer.parseInt(sc.nextLine());
		System.out.println("Enter details of showtimes in CSV(Show Date(dd/MM/yyyy),Show Time Interval(Eg:1PM-4PM),Tickets Booked)");
		for(int i=0;i<n;i++)
		{
			String details= sc.nextLine();//Get details from user
			String det[]= details.split(",");//Split details
			//TicketBooking tb= new TicketBooking(/*new SimpleDateFormat("dd/MM/yyyy").parse(det[0])*/new SimpleDateFormat("ha-ha").parse(det[1]),Integer.parseInt(det[2]));
			map1.put(det[1],Integer.parseInt(det[2]));//Store it into map
			map2.put(new SimpleDateFormat("dd/MM/yyyy").parse(det[0]),map1);
		}
		System.out.println("Enter a show details to find tickets booked in CSV(Show Date(dd/MM/yyyy),Show Time Interval(Eg:1PM-4PM))");
		String search=sc.nextLine();//Get data to search
		String details[]= search.split(",");//Split the data to search
		if(map2.containsKey(new SimpleDateFormat("dd/MM/yyyy").parse(details[0])))//If map2 consists the date
		{
			if(map1.containsKey(details[1]))//If map1 contains time
			{
				System.out.println("Tickets Booked = "+map1.get(details[1]));//Print number of tickets
			}
			else
			{
				System.out.println("No show in a particular time");//If map2 doesnt contain key then print no show
			}
			
		}
		else
		{
			System.out.println("No show in a particular time");//If map2 doesnt contain key then print no show
		}

	}

}