package box;


	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;

	public class MainStall {

	    public static void main(String[] args) throws Exception {
			
			InputStreamReader input= new InputStreamReader(System.in);
			BufferedReader br= new BufferedReader(input);//Initializing scanner
			
			System.out.println("Enter the name of the stall:"); //Getting details
			String sname= br.readLine();
			
			System.out.println("Enter the detail of the stall:");
			String sdetail= br.readLine();
			
			System.out.println("Enter the owner name of the stall:");
			String sowner= br.readLine();
			
			System.out.println("Enter the type of the stall:");
			String stype= br.readLine();
			
			System.out.println("Enter the size of the stall in square feet:");
			int size=Integer.parseInt(br.readLine());
			
			Stall p= new Stall(sname,sdetail,sowner);
			
			System.out.println("Does the hall have TV?(y/n)");
			String sh= br.readLine();
			char ch= sh.charAt(0);
			
			if(ch=='y')
			{
				System.out.println("Enter the number of TV:");
				int ntv= Integer.parseInt(br.readLine());
				System.out.println("The cost of the stall is "+p.computeCost(stype,size,ntv));
			}
			else
			{
				System.out.println("The cost of the stall is "+p.computeCost(stype,size));
			}
		}

	}
