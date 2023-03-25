package application;

public abstract class User {
	
	private String fName;
	private String mInitial;
	private String lName;
	private String userID;
	private String password;
	private String address;
	private String city;
	private String state;
	private int zip;
	private int phone;
	private String email;
	
	
	public User() {}
	
	
	public User(String fName, String mInitial, String lName, String userID, String password, 
				String address, String city, String state, int zip, int phone, String email) {
		this.setfName(fName);
		this.setmInitial(mInitial);
		this.setlName(lName);
		this.setUserID(userID);
		this.setPassword(password);
		this.setAddress(address);
		this.setCity(city);
		this.setState(state);
		this.setZip(zip);
		this.setPhone(phone);
		this.setEmail(email);
	}


	public String getfName() {
		return fName;
	}


	public void setfName(String fName) {
		this.fName = fName;
	}


	public String getmInitial() {
		return mInitial;
	}


	public void setmInitial(String mInitial) {
		this.mInitial = mInitial;
	}


	public String getlName() {
		return lName;
	}


	public void setlName(String lName) {
		this.lName = lName;
	}


	public String getUserID() {
		return userID;
	}


	public void setUserID(String userID) {
		this.userID = userID;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public int getZip() {
		return zip;
	}


	public void setZip(int zip) {
		this.zip = zip;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getPhone() {
		return phone;
	}


	public void setPhone(int phone) {
		this.phone = phone;
	}
	
}
