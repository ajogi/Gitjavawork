package Code;
 class Country
{
    private
 String iataCountryCode;
      String countryName;
Country(){}
public Country(String iataCountryCode, String countryName) {
		this.iataCountryCode = iataCountryCode;
		this.countryName = countryName;
	}
public String getIataCountryCode() {
	return iataCountryCode;
}
public void setIataCountryCode(String iataCountryCode) {
	this.iataCountryCode = iataCountryCode;
}
public String getCountryName() {
	return countryName;
}
public void setCountryName(String countryName) {
	this.countryName = countryName;
}
public String toString()
{
 	////fill your code;
     return String.format("%-25s %s\n",iataCountryCode,countryName);
}


}
