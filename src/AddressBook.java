import java.util.*;
public class AddressBook  {
	ArrayList <BuddyInfo> buddyList;
	public AddressBook() {
		buddyList = new ArrayList<BuddyInfo>();
	}

	public void addBuddy(BuddyInfo b) {
		if (b != null ) {
			buddyList.add(b);
		}
	
	}
	public void removeBuddy(int index) {
		if (index >=0 && index<buddyList.size()) {
			buddyList.remove(index);
		}
			

	}
	
	public static void main(String[] args) {
		System.out.println("Address Book");
		AddressBook A1 = new AddressBook();
		BuddyInfo b1 = new BuddyInfo("Sam","123 hunt rd.", "123456789");
		A1.addBuddy(b1);
		A1.removeBuddy(0);
		
	}
	
	//Hello Edit made for lab3
	
}
