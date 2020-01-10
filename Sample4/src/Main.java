import java.io.*;

import java.text.ParseException;

import java.text.SimpleDateFormat;

import java.util.Date;

 

public class Main {

public static void main(String args[]) throws InterruptedException, NumberFormatException, IOException, ParseException{

Integer call,id,status,i=0,j=0,sid;

String ch,ocode,dcode;

SimpleDateFormat sdf=new SimpleDateFormat("kk:mm:ss");

Date dt,at;

Flight fl[]=new Flight[10];

Schedule sl[]=new Schedule[10];

BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

System.out.println("Enter the flight details");

do{

    System.out.println("Enter the flight call :");

    call=Integer.parseInt(br.readLine());

    System.out.println("Enter the schedule id :");

    id=Integer.parseInt(br.readLine());

    System.out.println("Enter the flight status id :");

    status=Integer.parseInt(br.readLine());

    fl[i]=new Flight(call,id,status);

    System.out.println("Do you want to enter more ? (YES/NO)");

    ch=br.readLine();

    i++;

   }while(ch.equals("YES"));

System.out.println("Enter the schedule details");

do{

    System.out.println("Enter the schedule id :");

    sid=Integer.parseInt(br.readLine());

    System.out.println("Enter the origin iata airport Code :");

    ocode=br.readLine();

    System.out.println("Enter the destination iata airportCode :");

    dcode=br.readLine();

    System.out.println("Enter the departure time :");

    dt=sdf.parse(br.readLine());

    System.out.println("Enter the arrival time :");

    at=sdf.parse(br.readLine());

    sl[j]=new Schedule(sid,ocode,dcode,dt,at);

    System.out.println("Do you want to enter more ? (YES/NO)");

    ch=br.readLine();

    j++;

  }while(ch.equals("YES"));

System.out.println("Enter the flight call :");

Integer flcall=Integer.parseInt(br.readLine());

int flag=0,flag1=0;

for(int i1=0;i1<i;i1++)

{

    if(fl[i1].getFlightCall()==flcall)

    {

        for(int i2=0;i2<j;i2++){

            if(sl[i2].getScheduleId()==fl[i1].getScheduleId()){

        System.out.println("Schedule Details");

        System.out.println("Schedule id :"+sl[i2].getScheduleId());

        System.out.println("Origin iata airport code :"+sl[i2].getOriginIataAirportCode());

        System.out.println("Destination iata airport code :"+sl[i2].getDestIataAirportCode());

        System.out.println("Departure time :"+sdf.format(sl[i2].getDepartureTime()));

        System.out.println("Arrival time :"+sdf.format(sl[i2].getArrivalTime()));

        flag++;

    }}}

}

if(flag==0)

System.out.println("Flight with id "+flcall+" not found !\nSchedule information does not exist for this flight yet !");

System.out.println("Enter the schedule id :");

Integer slid=Integer.parseInt(br.readLine());

for(int j1=0;j1<j;j1++)

{

    if(sl[j1].getScheduleId()==slid)

    {

        for(int j2=0;j2<i;j2++){

           if(fl[j2].getScheduleId()==sl[j1].getScheduleId())

            {

        System.out.println("Flight Details");

       System.out.println("Flight call :"+fl[j2].getFlightCall());

        System.out.println("Schedule id :"+fl[j2].getScheduleId());

        System.out.println("Flight status id :"+fl[j2].getFlightStatusId());

        flag1++;

    }}}

}

if(flag1==0)

System.out.println("Schedule with id "+slid+" not found !\nFlight information does not exist for this schedule yet !");
}}