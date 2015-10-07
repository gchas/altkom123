package examples.mod04.reservation;

public class Customer {
	private String name;
	private String address;
	private Trip trip;

	public Customer(String name) {
		this.name = name;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void assignTrip(Trip trip) {
		this.trip = trip;
	}
	
	public String geInfo() {
		return "Name: "+name+"\nAddress: "+address+"\nHas a following trip: "+trip.getInfo()+"\n";
	}
}

