package codecamp;
import java.util.ArrayList;
import java.util.List;
public class Arraylist
{

	public static void main(String[] args) 
	{
		int key;
		List<Integer> al=new ArrayList<Integer>();
		al.add(23);
		al.add(35);
		al.add(123);
		al.add(273);
		al.add(1223);
		key=273;
		al.contains(key);
		if(al.contains(key)==true)
		{
			System.out.println(key+" found in Array List");
		}
		else
			System.out.println(key+" Not found in Array List");
	}	
		boolean contains(int key)
		{
			return true;
		}

	}




