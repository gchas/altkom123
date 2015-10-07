package examples.mod04.reservation;

public class TravelOffice {
	private static TravelOffice instance;
	private TravelOffice() {
		//
	}
	public static TravelOffice getInstance() {
		if (instance == null) {
			instance = new TravelOffice();
		}
		return instance;
	}
	
	int customerCount = 0;
	Customer customers [] = new Customer[2];
	Trip trip;
	
	public void addCustomer(Customer customer) {
		if (customerCount == customers.length) {
			Customer temp[] = new Customer[customers.length*2];
			System.arraycopy(customers, 0, temp, 0, customers.length);
			customers = temp;
		}
		customers[customerCount++] = customer;
	}
	
	public int getCustomerCount() {
		return customerCount;
	}
	
	public String getInfo() {
		String report = "";
		for (int i = 0; i<customerCount; i++) {
			report += customers[i].geInfo()+"\n";
		}
		
		return report;
	}
}
