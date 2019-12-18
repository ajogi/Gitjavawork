package Additional;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Additional.Stall;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class MainStall {
 public static void main(String[] args) throws IOException {
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  int nos = 0;
  System.out.println("Enter the number of stalls:");
  nos = Integer.parseInt(br.readLine());
  
  List<Stall> slist = new ArrayList<Stall>();
  
   while(nos>0) {
    Stall s=new Stall();
  String input = br.readLine();
  
  String array[]=input.split(",");
  
   s.setSname(array[0]);
   s.setStype(array[1]);
   s.setA(Double.parseDouble(array[2])); s.setOname(array[3]);
   
  //add object to the list
   slist.add(s);
   nos--;
 
  }
  
 
   double totalCost = 0.0;
  for (Stall s : slist) {
   totalCost += s.getA() * 150.0;
  }

  System.out.println("The total revenue is " + totalCost);
 }
}