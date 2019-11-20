package sivaramexamples;

public class Addressbookdemo {
	public static void main(String[] args) {
		  //creating AddressBook - inner class object
		  Addressbook ab=new Addressbook();
		  //creating Address - inner class object
		  Addressbook.Address address=new Addressbook().new Address();
		  //set values to attributes of inner class
		  address.setHousename("Jayalakshmi nilayam");
		  address.setStreet("Seethammavari Street");
		  address.setCity("Vijayawada");
		  address.setState("Andhra pradesh");
		  //set values to attributes of outer class
		  ab.setTempAdd(address);
		  
		  //creating Address - inner class object
		  Addressbook.Address paddress=new Addressbook().new Address();
		  //set values to attributes of inner class
		  paddress.setHousename("Srinivas Nivas");
		  paddress.setStreet("Bhavani puram");
		  paddress.setCity("Ongole");
		  paddress.setState("Andhra pradesh");
		  
		  //set values to attributes of outer class
		  ab.setPermAdd(paddress);
		  
		  //display addresses
		  System.out.println("Temporary address:\n"+ab.getTempAdd());
		  System.out.println("Permenant address:\n"+ab.getPermAdd());
		 }
		}
