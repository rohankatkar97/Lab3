
public class BuddyInfo {
	private String name;
	private String address;
	private String phoneNumber;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	
		public BuddyInfo(String name , String address, String phoneNumber) {
			this.name = name;
			this.address = address;
			this.phoneNumber = phoneNumber;
			
		}
	
	
	
	public static void main(String[] args) {
		
		BuddyInfo buddy1 = new BuddyInfo("Bob" , "15 RidgeCrest", "123456789");
		buddy1.setName("Homer");
		System.out.println("Hello " + buddy1.getName());
	}

}
