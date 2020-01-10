import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws ParseException {
		
		Scanner sc= new Scanner(System.in);//Initialize scanner
		List<Event> li= new ArrayList<Event>();//Initialize list
		
		System.out.println("Enter the number of events");//Get number of events from user
		int n= Integer.parseInt(sc.nextLine());
		if(n<=0)//If n value is zero or less than zero
		{
			System.out.println("Invalid Input");//Print invalid input
		}
		else//Else
		{
			System.out.println("Enter event details in CSV(Event Name,Event Date,Organizer Name)");//Get details from user
			for(int i=0;i<n;i++)
			{
				String event=sc.nextLine();
				String det[]= event.split(",");//Split details
				Event et= new Event(det[0], new SimpleDateFormat("dd/MM/yyyy").parse(det[1]),det[2]);//Create object for Event class
				li.add(et);//Add to the list
			}
			EventThread et= new EventThread();//Create object for event thread
			Map<String, Integer> count= et.eventMonths(li);//Get count of months from eventMonths method
			Set<String> set= count.keySet();//Initialize separate set to store keys of map
			for (String string : set) {//Print using keySet
				System.out.println(string+" = "+count.get(string)+" events");
			}
		}

	}

}