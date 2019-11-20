package myebox;
import java.util.Scanner;
import static java.lang.System.out;
import java.text.DecimalFormat;
public class Getterandsetter {

	public static void Getterandsetter(String[] args) {
	ItemType it=new ItemType();
	Scanner sc=new Scanner(System.in);
	out.println("Enter the Item Type Name");
	it.setName(sc.nextLine());
	out.println("Enter the Deposit Amount");
	it.setDeposit(sc.nextDouble());
	out.println("Enter the Cost per day of the Item Type");
	it.setCostPerDay(sc.nextDouble());

	//call display method
	display(it);
	}
	public static void display(ItemType it)
	{
	DecimalFormat df=new DecimalFormat("#####.0");
	out.println("Item Name:"+it.getName());
	out.println("Deposit Amount:"+df.format(it.getDeposit()));
	out.println("Cost Per Day:"+df.format(it.getCostPerDay()));
	}
}
