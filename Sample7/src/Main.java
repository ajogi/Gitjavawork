import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
public class Main {
 
 public static void main(String args[])//Start of main method
 {
  Scanner sc= new Scanner(System.in);//Initializing scanner
  List<Address> add= new ArrayList<Address>();//Defining list to store address
  Map<String,List<Address>> ct= new HashMap<String,List<Address>>();//Define map to store city as key value
  Map<String,Map<String,List<Address>>> st= new HashMap<String, Map<String,List<Address>>>();
  //Define map to store state as key
  System.out.println("Enter the number of address");//Get number of addresses
  int n= Integer.parseInt(sc.nextLine());
  
  for(int i=0;i<n;i++)
  {
   System.out.println("Enter the address "+(i+1)+" detail");//Get addresses from user
   String s= sc.nextLine();
   String a[]= s.split(",");//Split addresses
   Address ad= new Address(a[0], a[1], a[2], a[3], Integer.parseInt(a[4]));//Create object for address class and load details
   add.add(ad);//Add address details to list
   ct.put(a[2], add);//Add city name and list to map
   st.put(a[3], ct);//Add statename and previous map to statemap
  }
    
  /*for (String string : ct) {
	System.out.println(string);
}*/
  
  System.out.println("Enter the state to be searched");//Get element to be searched from user
  String sstate= sc.nextLine();
  if(st.containsKey(sstate))//Check if state contains in key of sstate map
  {
   System.out.println("Enter the city to be searched");
   String scity= sc.nextLine();
   if(ct.containsKey(scity))//Check if value contains in key of svalue map
   {
	System.out.printf("%-15s%-15s%-15s%-15s%-15s\n","Line 1","Line 2","City","State","Pincode");
    for (Address address : add) {//Iterate address list
    	if(address.getCity().equals(scity))//If city entered equals to the city in list
    	{
    		System.out.println(address);	//Print the address
	    }	
	}
   }
   else
   {
    System.out.println("Searched city not found");//If state is not found then print not found
   }
   
  }
  else
  {
   System.out.println("Searched state not found");//If state is not found then print not found
  }
 }
}