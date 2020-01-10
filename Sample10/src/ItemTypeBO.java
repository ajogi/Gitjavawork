import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class ItemTypeBO {
    
public List<ItemType> readFromFile(BufferedReader br) throws IOException//readFromFile method
{
	List<ItemType> li= new ArrayList<ItemType>();//Initialize arraylist 
	String line;//Initialize line
	while((line=br.readLine())!=null){//If file not reached to end
		
		String details[] = new String[3];//Initialize string array to store data
		StringTokenizer st=new StringTokenizer(line);//Initialize string tokenizer to remove space
		int i=0;  
		while (st.hasMoreElements()) {
			details[i]=st.nextToken();//Copy data int array
			i++;
		}
		
		ItemType it= new ItemType(details[0],Double.parseDouble(details[1]),Double.parseDouble(details[2]));//Create object for itemtype class and load data into constructor
		li.add(it);//Add it to list
	}
	return li;//Return list
	
}

public List<ItemType> depositList(List<ItemType> list)//Deposit list method start
{
	List<ItemType> li= new ArrayList<ItemType>();//Initialize arraylist
	for (ItemType itemType : list) {//For elements in list
		if(itemType.getDeposit()>2000)//If deposit is greater than 2000
		{
			ItemType it= new ItemType(itemType.getName(),itemType.getDeposit(),itemType.getCostPerDay());//Create object for itemtype class and load data into constructor
			li.add(it);//Add it to list
		}
	}
	return li;//Return list
}

public void display(List<ItemType> list)//Display method start
{
	for (ItemType itemType : list) {//Print data in list
		System.out.format("%-15s %-15s %s\n",itemType.getName(),itemType.getDeposit(),itemType.getCostPerDay());
	}
	
}
}