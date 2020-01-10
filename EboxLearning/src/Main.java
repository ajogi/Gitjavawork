import java.util.*;
import java.io.*;
public class Main {
public static void main(String args[]) throws Exception{
String iataAirportCode;
String airportName;
String airportCity;
String iataCountryCode;
Integer numberOfDirection;
String originIataAirportCode;
String destIataAirportCode;
Airport airport;

Scanner s=new Scanner(System.in);
System.out.println("Enter the iata airport code");
iataAirportCode=s.next();
System.out.println("Enter the airport name");
airportName=s.next();
System.out.println("Enter airport city");
airportCity=s.next();
System.out.println("Enter iata country code");
iataCountryCode=s.next();
System.out.println("Enter the number of directions");
int n=s.nextInt();
Direction direction[]=new Direction[n];

for(int i=0;i<n;i++) {

System.out.println("Enter direction "+(i+1)+" details");
System.out.println("Enter the origin iata airport code");
originIataAirportCode=s.next();
System.out.println("Enter the destination iata airport code");
destIataAirportCode=s.next();
direction[i]=new Direction(originIataAirportCode,destIataAirportCode);


}
airport=new Airport(iataAirportCode,airportName,airportCity,iataCountryCode,direction,n);

airport.display();
}

}