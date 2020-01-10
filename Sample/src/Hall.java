public class Hall {
    
	private String name;
	private int costPerDay;
	private String ownerName;
	
	public Hall() {
		super();
	}

	public Hall(String name, int costPerDay, String ownerName) {
		super();
		this.name = name;
		this.costPerDay = costPerDay;
		this.ownerName = ownerName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCostPerDay() {
		return costPerDay;
	}

	public void setCostPerDay(int costPerDay) {
		this.costPerDay = costPerDay;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

/*	@Override
	public String toString() {
		return "Hall [name=" + name + ", costPerDay=" + costPerDay + ", ownerName=" + ownerName + "]";
	}*/
	
	

}