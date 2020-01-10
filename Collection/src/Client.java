public class Client
{
    private String clientId;    //Declaring variables
	private String  clientName;
	private String  email;
	private String passportNumber;
	
	public Client(String clientId, String clientName, String email, String passportNumber) {
		super();
		this.clientId = clientId;
		this.clientName = clientName;
		this.email = email;
		this.passportNumber = passportNumber;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}
	
	

}