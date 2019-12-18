package Additional;


	import java.util.Scanner;

	import Additional.ElectricGuitar;
	import Additional.ElectronicKeyboard;
	import Additional.Instrument;

	public class MainElectric {
		public static void main(String[] args) {
			Instrument i;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Music Instrument to be played\r\n" + "Electric Guitar\r\n" +"Electronic Keyboard"); 
		    
		    switch (sc.nextLine()) {
		    case "Electric Guitar":
		    	ElectricGuitar eg=new ElectricGuitar();
		    	eg.play();
		    	break;
		    case "Electronic Keyboard":
		    	ElectronicKeyboard ek=new ElectronicKeyboard();
		    	ek.play();
		        break;
		     default:
		    	 System.out.println("Instrument Type in not in the given list");
		    }
		    
					
		    
		    }
		    
		    
		    
	}
