import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

		TreeMap<String,String> tm= new TreeMap<String,String>();
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the number of clients");
		int n= Integer.parseInt(sc.nextLine());
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the details of the client "+(i+1));
			String clientId=sc.nextLine();
			String clientName= sc.nextLine();
			String email=sc.nextLine();
			String passportNumber= sc.nextLine();
			Client c= new Client(clientId, clientName, email, passportNumber);
			tm.put(clientId, clientName+"--"+email+"--"+passportNumber);
		}
		
		System.out.println("Client Details");
		for(Entry<String, String> m:tm.entrySet()){    
		       System.out.println(m.getKey()+"--"+m.getValue());    
		      }    
		System.out.println("Enter the id of the client to be searched");
		String search= sc.nextLine();
		System.out.println("Client Details");
		if(tm.containsKey(search))
		{
			System.out.println(tm.get(search));
		}
		else
		{
			System.out.println("Client not found");
		}

	}

}