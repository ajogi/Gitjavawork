package box;
import java.util.*;
import java.text.*;

public class Calender {
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
     int dd=1;
     int month=0;
     int year=sc.nextInt();
    Date date= (new GregorianCalendar(year, month, dd)).getTime();
    SimpleDateFormat f = new SimpleDateFormat("EEEE");
     String day=f.format(date);
     System.out.println(day);
     }
}
