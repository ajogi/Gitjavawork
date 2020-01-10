package Code;
import java.io.*;
import java.util.*;
public class Main {
public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer n,i,ch;
		  String clientName,phoneNumber,email,passport,countryName,iataCountryCode;
		  Integer clientId;
		  System.out.println("Enter number of clients");
		   n=Integer.parseInt(br.readLine());
		  Client clientList[] = new Client[n];
		  ClientBO clientBo=new ClientBO();
          Country country=new Country();
		  for(i=0;i<n;i++)
		  {
		   clientList[i]=new Client();
		   System.out.println("Enter client "+(i+1)+" details:");
		   System.out.println("Enter the client id");
		   clientId=Integer.parseInt(br.readLine());
           System.out.println("Enter the client name");
		   clientName=br.readLine();
           System.out.println("Enter the phone number");
		   phoneNumber=br.readLine();
		   System.out.println("Enter the email id");
		   email=br.readLine();
		   System.out.println("Enter the passport number");
		   passport=br.readLine();
		   System.out.println("Enter the iata country code");
		   iataCountryCode=br.readLine();
		   System.out.println("Enter the country name");
		   countryName=br.readLine();
		   country=new Country(iataCountryCode,countryName);  
           clientList[i] = new Client(clientId,clientName,phoneNumber,email,passport,country);
          }
          do
		  {
           System.out.println("Menu:");
		   System.out.println("1.View client details");
		   System.out.println("2.Filter client with country");
		   System.out.println("3.Exit");
		   ch=Integer.parseInt(br.readLine());
           if(ch==1)
		   {
		       System.out.format("%-25s %-25s %-25s %-25s %-25s %-25s %s\n","ClientId","ClientName","PhoneNumber","Email","Passport","IATACountryCode","CountryName");
		       clientBo.viewDetails(clientList);
		   }
		   else if(ch==2)
		   {
		        System.out.println("Enter country name");
		        countryName=br.readLine();
			    System.out.format("%-25s %-25s %-25s %-25s %-25s %-25s %s\n","ClientId","ClientName","PhoneNumber","Email","Passport","IATACountryCode","CountryName");
		        clientBo.printClientDetailsWithCountry(clientList,countryName);
		   }  
		   else
		         break;
      }while(ch<=2);
		
	}

}