class Direction
{
    private 
    
    Airport airport;
    String originIataAirportCode;
    String destIataAirportCode;
    
    
    public Direction( String originIataAirportCode,String destIataAirportCode) {
		this.originIataAirportCode = originIataAirportCode;
		this.destIataAirportCode = destIataAirportCode;
	}


	public Airport getAirport() {
		return airport;
	}


	public void setAirport(Airport airport) {
		this.airport = airport;
	}


	public String getOriginIataAirportCode() {
		return originIataAirportCode;
	}


	public void setOriginIataAirportCode(String originIataAirportCode) {
		this.originIataAirportCode = originIataAirportCode;
	}


	public String getDestIataAirportCode() {
		return destIataAirportCode;
	}


	public void setDestIataAirportCode(String destIataAirportCode) {
		this.destIataAirportCode = destIataAirportCode;
	}
    
    
	
	
    
    
}
