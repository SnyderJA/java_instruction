
public class Vendor {

	
	//Variables
	private int id;
	private String code;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String phoneNumber;
	private String email;
	private boolean preApproved;
	
	
	
	public Vendor(int id, String code, String address, String city, String state, String zip, String phoneNumber,
			String email, boolean preApproved) {
		super();
		this.id = id;
		this.code = code;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.preApproved = preApproved;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getCode() {
		return code;
	}



	public void setCode(String code) {
		this.code = code;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getState() {
		return state;
	}



	public void setState(String state) {
		this.state = state;
	}



	public String getZip() {
		return zip;
	}



	public void setZip(String zip) {
		this.zip = zip;
	}



	public String getPhoneNumber() {
		return phoneNumber;
	}



	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public boolean isPreApproved() {
		return preApproved;
	}



	public void setPreApproved(boolean preApproved) {
		this.preApproved = preApproved;
	}



	@Override
	public String toString() {
		return "Vendor [id=" + id + ", code=" + code + ", address=" + address + ", city=" + city + ", state=" + state
				+ ", zip=" + zip + ", phoneNumber=" + phoneNumber + ", email=" + email + ", preApproved=" + preApproved
				+ "]";
	}
	


}



