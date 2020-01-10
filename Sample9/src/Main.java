import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);//Initialize scanner
		
		List<Hall> li= new ArrayList<>();//Initialize arraylist to store hall details
		
		System.out.println("Enter the number of halls:");//Get number of halls from user
		int n= Integer.parseInt(sc.nextLine());
		
		for(int i=0;i<n;i++)
		{
			String hall=sc.nextLine();//Get hall details
			String det[]= hall.split(",");//Split hall details
			Hall h= new Hall(det[0],det[1],Double.parseDouble(det[2]),det[3]);//Load it into constructor
			li.add(h);//Add it to list
		}
		Hall.writeHallDetails(li);//Call write hall list 
		//System.out.println("Success....");	
	}
}