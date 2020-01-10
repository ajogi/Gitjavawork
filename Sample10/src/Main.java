import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
		
		FileReader input= new FileReader("input.txt");
		BufferedReader br= new BufferedReader(input);
		List<ItemType> li=null;
		List<ItemType> li2=null;
		
		ItemTypeBO ibo= new ItemTypeBO();//Creating object for ItemTypeBO class
		
		try {
			li=ibo.readFromFile(br);//Call method readfromFile to get data from file to list
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		
		int count=0;//To get count of entries whose deposit is more than 2000
		for (ItemType string : li) {
			if(string.getDeposit()>2000)//Check deposit
			{
				count++;//If deposit is more than 2000, increment the count
			}
		}
		
		if(count==0)//If count is zero
		{
			System.out.println("No item type has deposit more than 2000");//Print no item type
		}
		else
		{
			li2=ibo.depositList(li);
			System.out.format("%-15s %-15s %s\n","Item type","Deposit","Cost per day");//Else seperate list of deposites
			ibo.display(li2);//Display separated list
		}
		
		

	}

}