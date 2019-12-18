package box;



import java.util.*;

public class Collection {

    public static void main(String[] args) {
   
System.out.println("Enter the number of passengers in First friday flight from Chennai to Coimbatore");
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
List<String> firstweek=new ArrayList<String>();
System.out.println("Enter the passengers Names");
for (int i = 0; i < num; i++) {
firstweek.add(sc.next());
}
System.out.println("Enter the number of passengers in Second friday flight from Chennai to Coimbatore");

int num1=sc.nextInt();
List<String> secondweek=new ArrayList<String>();
System.out.println("Enter the passengers Names");
for (int i = 0; i < num1; i++) {
secondweek.add(sc.next());
}

System.out.println("Enter the number of passengers in third friday flight from Chennai to Coimbatore");

int num2=sc.nextInt();
List<String> thirdweek=new ArrayList<String>();
System.out.println("Enter the passengers Names");
for (int i = 0; i < num2; i++) {
thirdweek.add(sc.next());
}
System.out.println("Selected passengers for discount:");
for (String item1 : thirdweek) {
for (String item2 : secondweek) {
for (String item3 : firstweek) {
if(item1.equals(item2))
{
if(item1.equals(item3))
{
System.out.println(item1);
}
}

}

}
}
}
}

