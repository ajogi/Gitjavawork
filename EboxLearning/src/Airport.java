class Airport{
    private 
    String iataAirportCode;
    String airportName;
    String airportCity;
    String iataCountryCode;
    Direction direction[];
    Integer numberOfDirection;
    
    
    public Airport(String iataAirportCode, String airportName,String airportCity, String iataCountryCode, Direction[] direction,Integer numberOfDirection) {
		super();
		this.iataAirportCode = iataAirportCode;
		this.airportName = airportName;
		this.airportCity = airportCity;
		this.iataCountryCode = iataCountryCode;
		this.direction = direction;
		this.numberOfDirection=numberOfDirection;
	}


	public String getIataAirportCode() {
		return iataAirportCode;
	}


	public void setIataAirportCode(String iataAirportCode) {
		this.iataAirportCode = iataAirportCode;
	}


	public String getAirportName() {
		return airportName;
	}


	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}


	public String getAirportCity() {
		return airportCity;
	}


	public void setAirportCity(String airportCity) {
		this.airportCity = airportCity;
	}


	public String getIataCountryCode() {
		return iataCountryCode;
	}


	public void setIataCountryCode(String iataCountryCode) {
		this.iataCountryCode = iataCountryCode;
	}


	public Direction[] getDirection() {
		return direction;
	}


	public void setDirection(Direction[] direction) {
		this.direction = direction;
	}
    
    
	public Integer getNumberOfDirection() {
		return numberOfDirection;
	}


	public void setNumberOfDirection(Integer numberOfDirection) {
		this.numberOfDirection = numberOfDirection;
	}
    
    void display(){
        System.out.println("Airport details");
        System.out.printf("%-25s %-25s %-25s %s\n","IataAirportCode","AirportName","AirportCity","IataCountryCode");
        System.out.printf("%-25s %-25s %-25s %s\n",this.iataAirportCode,this.airportName,this.airportCity,this.iataCountryCode);
    System.out.println("Direction Details");
    System.out.format("%-30s %s\n","OriginIataAirportCode","DestinationIataAirportCode");
    for(Direction d:direction) {
            System.out.format("%-30s %s\n",d.getOriginIataAirportCode(),d.getDestIataAirportCode());
        }
        
    }
    
    
}
