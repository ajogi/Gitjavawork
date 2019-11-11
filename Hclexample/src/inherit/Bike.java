package inherit;

public class Bike implements Cycle,Automobile{

	@Override
	public boolean selfdriven() {
		return false;
	}

	@Override
	public void balance() {
		System.out.println("We should balance");
	}
	

}
