public class ItemType {
    
	private String name;//Declaring variables
	private double deposit;
	private double costPerDay;
	
	public ItemType() {//Default constructor
		super();
	}

	public ItemType(String name, double deposit, double costPerDay) {//Parameterized constructor
		super();
		this.name = name;
		this.deposit = deposit;
		this.costPerDay = costPerDay;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDeposit() {
		return deposit;
	}

	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}

	public double getCostPerDay() {
		return costPerDay;
	}

	public void setCostPerDay(double costPerDay) {
		this.costPerDay = costPerDay;
	}
}