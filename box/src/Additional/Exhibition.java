package Additional;
public class Exhibition extends Event {
	    private int noOfStall;
	    
	    public Exhibition()
	    {
	    
	    }



	public Exhibition(String name, String detail, String ownerName) {
	super(name, detail, ownerName);

	}


	public Exhibition(int noOfStall) {
	super();
	this.noOfStall = noOfStall;
	}
	public double projectedRevenue(int noOfStalls)
	{

	double stallPrice=10000;
	    double seatPrice=50;
	    return noOfStalls * stallPrice;
	}


	public int getNoOfStall() {
	return noOfStall;
	}


	public void setNoOfStall(int noOfStall) {
	this.noOfStall = noOfStall;
	}
	}

